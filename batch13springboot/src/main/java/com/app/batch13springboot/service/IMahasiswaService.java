package com.app.batch13springboot.service;

import java.util.List;

import com.app.batch13springboot.model.MahasiswaModel;

public interface IMahasiswaService {
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel);
	public String insertCount (MahasiswaModel mahasiswaModel);
	public List<MahasiswaModel> findAll();
	public MahasiswaModel findById(int id);
	public void deleteById (int id);
	public void updateById(MahasiswaModel mahasiswaModel);
}
