package ds.VitalSignsControlService;

public class Record {
 private int patientID;
 private int heartRateBPM;
 private double bodyTemp;
 private int Spo2;
 private String time;
 
 // Constructor
 public Record(int patientID, int heartRateBPM, double bodyTemp, int Spo2, String time) {
     this.patientID = patientID;
     this.heartRateBPM = heartRateBPM;
     this.bodyTemp = bodyTemp;
     this.Spo2 = Spo2;
     this.time = time;
 }

 // Getters and setters
 public int getPatientID() {
     return patientID;
 }

 public void setPatientID(int patientID) {
     this.patientID = patientID;
 }

 public int getHeartRateBPM() {
     return heartRateBPM;
 }

 public void setHeartRateBPM(int heartRateBPM) {
     this.heartRateBPM = heartRateBPM;
 }

 public double getBodyTemp() {
     return bodyTemp;
 }

 public void setBodyTemp(double bodyTemp) {
     this.bodyTemp = bodyTemp;
 }

 public int getSpo2() {
     return Spo2;
 }

 public void setSpo2(int Spo2) {
     this.Spo2 = Spo2;
 }

 public String getTime() {
     return time;
 }

 public void setTime(String time) {
     this.time = time; 
 }
 
 public boolean equals(Record record) {
	 boolean returnable = true;
	 if (getPatientID() != record.getPatientID()) {
		 returnable = false;
	 }
	 if (getHeartRateBPM() != record.getHeartRateBPM()) {
		 returnable = false;
	 }
	if (getBodyTemp() != record.getBodyTemp()) {
		returnable = false;
	}
	if (getSpo2() != record.getSpo2())
		returnable = false;
	return returnable;
 	}
}

