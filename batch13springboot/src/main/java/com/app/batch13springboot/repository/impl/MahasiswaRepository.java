package com.app.batch13springboot.repository.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.repository.IMahasiswaRepository;
import com.app.batch13springboot.service.IMahasiswaService;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	@Override
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO tb_mahasiswa (name, age, semester) VALUES (?,?,?)";
		
		jdbcTemplate.update(query, new Object[] {mahasiswaModel.getName(), mahasiswaModel.getAge(),mahasiswaModel.getSemester()});
		
		
		return mahasiswaModel;
	}

	@Override
	public int insertCount(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
		String query = "insert into tb_mahasiswa (name, age, semester) VALUES (?,?,?)";
		int result = jdbcTemplate.update(query, new Object[] {mahasiswaModel.getName(), mahasiswaModel.getAge(),mahasiswaModel.getSemester()});
		return result;
	}

	@Override
	public List<MahasiswaModel> findAll() {
		// TODO Auto-generated method stub
		String query = "select * from tb_mahasiswa";
		
		var result = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(MahasiswaModel.class));
		return result;
	}

	@Override
	public void updateById(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
		String query = "update tb_mahasiswa set name = ? where id = ?";
		
		jdbcTemplate.update(query, new Object[] {mahasiswaModel.getName(), mahasiswaModel.getId()});
		
	}

	@Override
	public MahasiswaModel findById(int id) {
		// TODO Auto-generated method stub
		
		String query = "select * from tb_mahasiswa where id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(MahasiswaModel.class), id);
		return result;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		String query = "delete from tb_mahasiswa where id = ?";
		jdbcTemplate.update(query, id);
		
	}
	
	

}
