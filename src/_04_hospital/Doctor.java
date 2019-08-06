package _04_hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	
}
