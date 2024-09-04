package com.services;

import java.util.HashSet;

import com.model.Specialization;

public interface SpecializationService {

	void add(Specialization specialization);
	HashSet<Specialization> getAll();
	
}
