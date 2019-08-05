package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

}
