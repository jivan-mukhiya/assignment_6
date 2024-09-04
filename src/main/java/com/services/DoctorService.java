package com.services;

import java.util.List;

import com.model.Doctor;

public interface DoctorService {

	
	void add(Doctor doctor);
	
	List<Doctor> search(String name,String specialization);
	List<Doctor> getDoctorList();
}
