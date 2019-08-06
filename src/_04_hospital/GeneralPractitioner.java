package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{

	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
}
