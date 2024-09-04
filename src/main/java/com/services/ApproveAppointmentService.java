package com.services;

import java.util.List;

import com.model.ApproveAppointment;

public interface ApproveAppointmentService {
	
	void approveAppointment(ApproveAppointment  appointment);

	List<ApproveAppointment> getApproveAppointments();
}
