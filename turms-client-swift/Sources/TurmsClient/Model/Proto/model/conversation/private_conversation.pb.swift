// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: model/conversation/private_conversation.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
private struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
    struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
    typealias Version = _2
}

public struct PrivateConversation {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    public var ownerID: Int64 = 0

    public var targetID: Int64 = 0

    public var readDate: Int64 = 0

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

private let _protobuf_package = "im.turms.proto"

extension PrivateConversation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
    public static let protoMessageName: String = _protobuf_package + ".PrivateConversation"
    public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
        1: .standard(proto: "owner_id"),
        2: .standard(proto: "target_id"),
        3: .standard(proto: "read_date"),
    ]

    public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
        while let fieldNumber = try decoder.nextFieldNumber() {
            // The use of inline closures is to circumvent an issue where the compiler
            // allocates stack space for every case branch when no optimizations are
            // enabled. https://github.com/apple/swift-protobuf/issues/1034
            switch fieldNumber {
            case 1: try try decoder.decodeSingularInt64Field(value: &ownerID)
            case 2: try try decoder.decodeSingularInt64Field(value: &targetID)
            case 3: try try decoder.decodeSingularInt64Field(value: &readDate)
            default: break
            }
        }
    }

    public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
        if ownerID != 0 {
            try visitor.visitSingularInt64Field(value: ownerID, fieldNumber: 1)
        }
        if targetID != 0 {
            try visitor.visitSingularInt64Field(value: targetID, fieldNumber: 2)
        }
        if readDate != 0 {
            try visitor.visitSingularInt64Field(value: readDate, fieldNumber: 3)
        }
        try unknownFields.traverse(visitor: &visitor)
    }

    public static func == (lhs: PrivateConversation, rhs: PrivateConversation) -> Bool {
        if lhs.ownerID != rhs.ownerID { return false }
        if lhs.targetID != rhs.targetID { return false }
        if lhs.readDate != rhs.readDate { return false }
        if lhs.unknownFields != rhs.unknownFields { return false }
        return true
    }
}
