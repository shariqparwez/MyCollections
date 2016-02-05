package com.training.domains;
import java.util.*;

public class Doctor implements Comparable<Doctor> {


	private long doctorId;
	private String doctorName;
	private String specialization;
	
	private TreeSet<Patient> patients;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(long doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public TreeSet<Patient> getPatients() {
		return patients;
	}
	public void setPatients(TreeSet<Patient> patients) {
		this.patients = patients;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ "]";
	}
	@Override
	public int compareTo(Doctor arg0) {
		// TODO Auto-generated method stub
		if(doctorId<arg0.doctorId) return -1;
		if(doctorId>arg0.doctorId) return 1;
		return 0;
		/*if((doctorName.compareTo(arg0.doctorName))<1) return -1;
		if((doctorName.compareTo(arg0.doctorName))>1) return 1;
		return 0;*/
	}
	
	
	
	
}
