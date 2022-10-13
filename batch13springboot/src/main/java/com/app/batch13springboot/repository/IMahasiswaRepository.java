package com.app.batch13springboot.repository;

import java.util.List;

import com.app.batch13springboot.model.MahasiswaModel;

public interface IMahasiswaRepository {
	public MahasiswaModel insert(MahasiswaModel mahasiswaModel);
	public int insertCount (MahasiswaModel mahasiswaModel);
	public List<MahasiswaModel> findAll();
	public MahasiswaModel findById(int id);
	public void deleteById (int id);
	public void updateById(MahasiswaModel mahasiswaModel);
}
