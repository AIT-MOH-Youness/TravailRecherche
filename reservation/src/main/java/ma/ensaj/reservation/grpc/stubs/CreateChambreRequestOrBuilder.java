// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.ensaj.reservation.grpc.stubs;

public interface CreateChambreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateChambreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>double prix = 3;</code>
   * @return The prix.
   */
  double getPrix();

  /**
   * <code>bool disponible = 4;</code>
   * @return The disponible.
   */
  boolean getDisponible();
}