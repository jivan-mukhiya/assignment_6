package com.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.ApproveAppointment;

public class ApproveAppointmentServiceImpl implements ApproveAppointmentService{

	@Override
	public void approveAppointment(ApproveAppointment appointment) {
		
		String sql="insert into approveappoientment(doctor, patient, date, status) "
				+ "values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			
			preparedStatement.setString(1, appointment.getDoctor());
			preparedStatement.setString(2, appointment.getPatient());
			preparedStatement.setString(3, appointment.getDate());
			preparedStatement.setBoolean(4, appointment.isStatus());
			
			preparedStatement.execute();

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ApproveAppointment> getApproveAppointments() {
		String sql="Select * from approveappoientment";
		List<ApproveAppointment>  approveAppointments=new ArrayList<>();
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				ApproveAppointment approveAppointment=new ApproveAppointment();

				approveAppointment.setDate(resultSet.getNString("date"));
				approveAppointment.setDoctor(resultSet.getString("doctor"));
				approveAppointment.setPatient(resultSet.getString("patient"));
				approveAppointment.setStatus(resultSet.getBoolean("status"));
				approveAppointments.add(approveAppointment);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return approveAppointments;
	}


}
