package com.app.batch13springboot.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.repository.IMahasiswaRepository;
import com.app.batch13springboot.service.IMahasiswaService;


@Service
public class MahasiswaService implements IMahasiswaService{
	
	@Autowired 
	IMahasiswaRepository mahasiswaRepository;
	
	@Override
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		MahasiswaModel result = mahasiswaRepository.insert(mahasiswaModel);
		return result;
	}

	@Override
	public String insertCount(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
		int result = mahasiswaRepository.insertCount(mahasiswaModel);
		return "Insert berhasil, sebanyak : "+ result;
	}

	@Override
	public List<MahasiswaModel> findAll() {
		// TODO Auto-generated method stub
		var result = mahasiswaRepository.findAll();
		return result;
	}

	@Override
	public void updateById(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		mahasiswaRepository.updateById(mahasiswaModel);
		
	}

	@Override
	public MahasiswaModel findById(int id) {
		// TODO Auto-generated method stub
		
		var result = mahasiswaRepository.findById(id);
		return result;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		mahasiswaRepository.deleteById(id);
	}

	



}
