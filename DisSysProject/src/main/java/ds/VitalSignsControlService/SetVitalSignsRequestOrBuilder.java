// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VitalSignsControl.proto

package ds.VitalSignsControlService;

public interface SetVitalSignsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.VitalSignsControlService.SetVitalSignsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 patientID = 1;</code>
   */
  int getPatientID();

  /**
   * <code>int32 heartRateBPM = 2;</code>
   */
  int getHeartRateBPM();

  /**
   * <code>double bodyTemp = 3;</code>
   */
  double getBodyTemp();

  /**
   * <code>int32 Spo2 = 4;</code>
   */
  int getSpo2();

  /**
   * <code>string time = 5;</code>
   */
  java.lang.String getTime();
  /**
   * <code>string time = 5;</code>
   */
  com.google.protobuf.ByteString
      getTimeBytes();
}
