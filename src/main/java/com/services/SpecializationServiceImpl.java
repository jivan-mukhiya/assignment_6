package com.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import com.db.DB;
import com.model.Specialization;

public class SpecializationServiceImpl implements SpecializationService{

	@Override
	public void add(Specialization specialization) {
		String sql="insert into specialization(code,name,note) values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement=DB.getConnectio().prepareStatement(sql);
			
			preparedStatement.setString(1, specialization.getCode());
			preparedStatement.setString(2, specialization.getName());
			preparedStatement.setString(3, specialization.getNote());
			
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public HashSet<Specialization> getAll() {
		String sql="select * from specialization";
		
		HashSet<Specialization> list=new HashSet<>();
		try {
			Statement statement = DB.getConnectio().createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			
			while(resultSet.next()) {
				Specialization specialization=new Specialization();
				
				specialization.setCode(resultSet.getString("code"));
				specialization.setName(resultSet.getString("name"));
				specialization.setNote(resultSet.getString("note"));

				list.add(specialization);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
