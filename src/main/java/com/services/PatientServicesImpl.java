package com.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DB;
import com.model.Patient;

public class PatientServicesImpl implements PatientServices{

	@Override
	public void add(Patient patient) {
		String sql="insert into patient(name,gender,Dob,Present_address,communication_address,"
				+ "Past_medical_history,Other_Details, Phone,marial_status) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			preparedStatement.setString(1, patient.getName());
			preparedStatement.setString(2, patient.getGender());
			preparedStatement.setString(3, patient.getDob());
			preparedStatement.setString(4, patient.getPresentAddress());
			preparedStatement.setString(5, patient.getCommunicationAddress());
			preparedStatement.setString(6, patient.getPastMedicalHistory());
			preparedStatement.setString(7, patient.getOtherDeatils());
			preparedStatement.setString(8, patient.getPhone());
			preparedStatement.setString(9, patient.getMarrialStatus());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
