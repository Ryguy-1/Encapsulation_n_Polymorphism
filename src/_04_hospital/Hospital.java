package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		
		private int patientCounter = 0;
		
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void addPatient(Patient p) {
		patients.add(p);
		
	}
	public ArrayList<Patient> getPatients(){
		return patients;

	}
	public void assignPatientsToDoctors() {

		for(Patient p: patients) {
			 for(Doctor d: doctors) {
				 if(d.patients.size()<3) {
					 try{
						 d.assignPatient(p);
						 break;
					 }catch (DoctorFullException dfe) {
						 System.out.println("DoctorFullException");
					 }
			 }
		}
		


}
}
}
