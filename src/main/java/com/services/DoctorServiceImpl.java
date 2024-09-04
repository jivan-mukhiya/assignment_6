package com.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Doctor;

public class DoctorServiceImpl implements DoctorService
{
	@Override
	public void add(Doctor doctor) {
		String sql="insert into doctor(name, emailId, specialization, address, mobile, gender, note, photo)"
				+ " values(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			
			preparedStatement.setString(1, doctor.getName());
			preparedStatement.setString(2, doctor.getEmialId());
			preparedStatement.setString(3, doctor.getSpecialization());
			preparedStatement.setString(4, doctor.getAddress());
			preparedStatement.setString(5, doctor.getMobile());
			preparedStatement.setString(6, doctor.getGender());
			preparedStatement.setString(7, doctor.getNote());
			preparedStatement.setString(8, doctor.getPhoto());
			
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Doctor> getDoctorList() {
		String sql="Select * from doctor";
		
		List<Doctor> doctorsList=new ArrayList<>();
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Doctor doctor=new  Doctor();
				doctor.setAddress(resultSet.getString("address"));
				doctor.setEmialId(resultSet.getString("emailId"));
				doctor.setGender(resultSet.getString("gender"));
				doctor.setMobile(resultSet.getString("mobile"));
				doctor.setName(resultSet.getString("name"));
				doctor.setNote(resultSet.getString("note"));
				doctor.setPhoto(resultSet.getString("photo"));
				doctor.setSpecialization(resultSet.getString("specialization"));
				doctorsList.add(doctor);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return doctorsList;
	}

	@Override
	public List<Doctor> search(String name, String specialization) {
		String sql="Select * from doctor where name=? and specialization=?";
		List<Doctor> doctorList=new ArrayList<>();		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, specialization);
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Doctor doctor=new  Doctor();
				doctor.setAddress(resultSet.getString("address"));
				doctor.setEmialId(resultSet.getString("emailId"));
				doctor.setGender(resultSet.getString("gender"));
				doctor.setMobile(resultSet.getString("mobile"));
				doctor.setName(resultSet.getString("name"));
				doctor.setNote(resultSet.getString("note"));
				doctor.setPhoto(resultSet.getString("photo"));
				doctor.setSpecialization(resultSet.getString("specialization"));
				doctorList.add(doctor);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return doctorList;
		
		
	}

}
