package com.training.domains;

import java.util.*;

public class Patient implements Comparable<Patient> {
	private long patientNo;
	private String patientName;
	private int patientAge;
	private String problemType;
	
	public Patient(long patientNo, String patientName, int patientAge, String problemType) {
		super();
		this.patientNo = patientNo;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.problemType = problemType;
	}

	@Override
	public int compareTo(Patient o) {
		if(patientNo<o.patientNo) return -1;
		if(patientNo>o.patientNo) return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Patient [patientNo=" + patientNo + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", problemType=" + problemType + "]";
	}

	
}
