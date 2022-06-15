const userOneNotificationContainer = document
    .querySelector("#user-one-notification-container");
const userTwoNotificationContainer = document
    .querySelector("#user-two-notification-container");
const ERROR_PREFIX = "error: ";

const clientUserOne = new TurmsClient('ws://localhost:10510', 30 * 1000);
const clientUserTwo = new TurmsClient('ws://localhost:10510', 30 * 1000);
const clientUserTwoPC = new TurmsClient('ws://localhost:10510', 30 * 1000);

function appendContainer(element, text, isError) {
    element.value = element.value
        + (element.value ? "\n" : "")
        + (isError ? "✖ " : "✔ ")
        + new Date().toLocaleTimeString() + "\n"
        + (isError ? ERROR_PREFIX : '')
        + text;
    element.scrollTop = element.scrollHeight;
}

function beautify(object) {
    if (object instanceof Error) {
        object = {
            message: object.message
        }
    }
    return JSON.stringify(object, null, "\t");
}

function setupClient(container, client, userId, password, targetId) {
    client.userService.addOnOfflineListener(sessionCloseInfo => {
        appendContainer(container, `onOffline: ${beautify(sessionCloseInfo)}`);
    });
    client.notificationService.addNotificationListener(notification => {
        appendContainer(container, `Notification: Receive a notification from other users or server: ${beautify(notification)}`);
    });
    client.messageService.addMessageListener(message => {
        appendContainer(container, `Message: Receive a message from other users or server: ${beautify(message)}`);
    });
    client.userService.login(userId, password,"DESKTOP")
        .then(() => {
            appendContainer(container, `login: User ${userId} has logged in--"DESKTOP"`);
            client.messageService.queryMessagesWithTotal([1])
                .then(messages => appendContainer(container, `Offline messages: ${beautify(messages)}`))
                .catch(error => appendContainer(container, `failed to query offline messages ${beautify(error)}`, true));
            // const intervalId = setInterval(() => {
            //     if (client.driver.isConnected) {
            //         client.messageService.sendMessage(
            //             false,
            //             targetId,
            //             new Date(),
            //             "Hello Turms, My userId is " + userId,
            //             null,
            //             30)
            //             .then(id => appendContainer(container, `message ${id} has been sent`))
            //             .catch(error => appendContainer(container, `failed to send message: ${beautify(error)}`, true));
            //     } else {
            //         clearInterval(intervalId);
            //     }
            // }, 2000);
            // client.groupService.createGroup(
            //     'Turms Developers Group',
            //     'This is a group for the developers who are interested in Turms',
            //     'nope')
            //     .then(id => appendContainer(container, `group ${id} has been created`))
            //     .catch(error => appendContainer(container, `failed to create group: ${beautify(error)}`, true));
        })
        .catch(reason => appendContainer(container, `failed to log in ${beautify(reason)}`, true));
}

function sendMessage(container,client,targetId,userId){
    if (client.driver.isConnected) {
        client.messageService.sendMessage(
            false,
            targetId,
            new Date(),
            "Hello Turms, My userId is " + userId,
            null,
            30)
            .then(id => appendContainer(container, `message ${JSON.stringify(id)} has been sent`))
            .catch(error => appendContainer(container, `failed to send message: ${beautify(error)}`, true));
    }
}

function user1Send(){
    sendMessage(userOneNotificationContainer, clientUserOne, "2","1");
}

function user2Send(){
    sendMessage(userTwoNotificationContainer, clientUserTwo, "1","2");
}

function start() {
    // const clientUserOne = new TurmsClient('ws://localhost:10510', 30 * 1000);
    // const clientUserTwo = new TurmsClient('ws://localhost:10510', 30 * 1000);
    const USER_ONE_ID = '1';
    const USER_TWO_ID = '2';
    setupClient(userOneNotificationContainer, clientUserOne, USER_ONE_ID, '123', USER_TWO_ID);
    setupClient(userTwoNotificationContainer, clientUserTwo, USER_TWO_ID, '123', USER_ONE_ID);
}