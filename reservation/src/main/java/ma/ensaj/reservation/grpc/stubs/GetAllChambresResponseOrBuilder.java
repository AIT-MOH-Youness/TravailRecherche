// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.ensaj.reservation.grpc.stubs;

public interface GetAllChambresResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllChambresResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  java.util.List<ma.ensaj.reservation.grpc.stubs.Chambre> 
      getChambresList();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  ma.ensaj.reservation.grpc.stubs.Chambre getChambres(int index);
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  int getChambresCount();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  java.util.List<? extends ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder> 
      getChambresOrBuilderList();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder getChambresOrBuilder(
      int index);
}
