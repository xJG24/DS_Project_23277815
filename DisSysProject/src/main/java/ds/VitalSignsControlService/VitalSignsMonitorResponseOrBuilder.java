// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VitalSignsControl.proto

package ds.VitalSignsControlService;

public interface VitalSignsMonitorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.VitalSignsControlService.VitalSignsMonitorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 patientID = 1;</code>
   */
  int getPatientID();

  /**
   * <code>.ds.VitalSignsControlService.OperationalStatus result = 2;</code>
   */
  int getResultValue();
  /**
   * <code>.ds.VitalSignsControlService.OperationalStatus result = 2;</code>
   */
  ds.VitalSignsControlService.OperationalStatus getResult();

  /**
   * <code>string statusMessage = 3;</code>
   */
  java.lang.String getStatusMessage();
  /**
   * <code>string statusMessage = 3;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();
}
