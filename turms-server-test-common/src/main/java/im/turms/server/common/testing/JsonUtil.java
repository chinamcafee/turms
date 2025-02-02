/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.testing;

import lombok.SneakyThrows;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.JsonNode;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.SerializationFeature;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author James Chen
 */
public final class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper()
            // Order map entries so that we can use the consistent output for comparison
            .enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);

    private JsonUtil() {
    }

    @SneakyThrows
    public static void assertEqual(Object actual, InputStream expected) {
        // We use String instead of byte[] for test debugging
        String json = MAPPER.writeValueAsString(actual);
        JsonNode actualJson = MAPPER.readTree(json);
        JsonNode expectedJson = MAPPER.readTree(expected);
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}
