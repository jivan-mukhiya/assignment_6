package com.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DB;
import com.model.Appointment;

public class AppointmentServiceImpl implements AppointmentService{

	@Override
	public void addAppointment(Appointment appointment) {
		String sql="insert into appointment(doctorId, date, slot, details, consultationFee)"
				+ " values(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			
			preparedStatement.setInt(1, appointment.getDoctor());
			preparedStatement.setString(2, appointment.getDate());
			preparedStatement.setInt(3, appointment.getSlot());
			preparedStatement.setString(4, appointment.getDetails());
			preparedStatement.setDouble(5, appointment.getConsultationFee());

			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
