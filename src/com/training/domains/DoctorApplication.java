package com.training.domains;
import java.util.*;


public class DoctorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doc1 = new Doctor(1049,"Dr. Jha", "Cardiologist");
		Doctor doc2 = new Doctor(1050,"Dr. Priyanka", "Dentist");
		Doctor doc3 = new Doctor(1048,"Dr. Kumar", "Dermilogist");
		
		NursingHome nursingHome = new NursingHome();
		
		nursingHome.addDoctor(doc1);
		nursingHome.addDoctor(doc2);
		nursingHome.addDoctor(doc3);
		
		Patient pat1 = new Patient(901,"Shariq",21,"Tooth Ache");
		Patient pat2 = new Patient(902,"Rahul",24,"Heart Checkup");
		Patient pat3 = new Patient(903,"John",33,"Skin Itching");
		
		TreeSet<Patient> patients = new TreeSet<Patient>();
		//HashSet is not ordered on any way - comparable/comparator not required
		//HashSet<Patient> patients = new HashSet<Patient>();
		patients.add(pat1);
		//boolean b=patients.add(pat2);
		//System.out.println(b);
		patients.add(pat3);
		
		doc1.setPatients(patients);
		
		nursingHome.printDoctorList();
		/*System.out.println("\nSorted List by ID - ");
		nursingHome.printSortedDoctorList();
		System.out.println("\nSorted List by NAME - ");
		nursingHome.printSortedDoctorList(2);
		System.out.println("\nSorted List by SPECIALIZATION - ");
		nursingHome.printSortedDoctorList(3);*/
		
		
		//ArrayList<String> names = new ArrayList<String>();
		
		/*names.add("Shariq");
		names.add("Rajan");
		names.add*/
	}

}
