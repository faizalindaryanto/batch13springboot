package com.app.batch13springboot.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.repository.IMahasiswaRepository;
import com.app.batch13springboot.service.IMahasiswaService;


@Service
public class MahasiswaService implements IMahasiswaService{
	
	@Autowired
	IMahasiswaRepository iMahasiswaRepository;
	
	@Override
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		return iMahasiswaRepository.insert(mahasiswaModel);
	}

	



}
