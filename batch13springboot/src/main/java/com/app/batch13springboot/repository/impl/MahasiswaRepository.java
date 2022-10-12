package com.app.batch13springboot.repository.impl;



import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {
	
	JdbcTemplate jdbcTemplate; 
	
	@Override
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO tb_mahasiswa (name, age, semester) VALUES (?,?,?)";
		
		jdbcTemplate.update(query, new Object[] {mahasiswaModel.getName(),mahasiswaModel.getAge(),mahasiswaModel.getSemester()});
		
		
		return mahasiswaModel;
	}
	
	

}
