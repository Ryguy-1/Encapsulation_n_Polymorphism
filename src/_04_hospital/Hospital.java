package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		
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


}
