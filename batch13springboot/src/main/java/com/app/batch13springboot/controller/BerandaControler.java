package com.app.batch13springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.service.IMahasiswaService;
import com.app.batch13springboot.service.impl.MahasiswaService;

@RestController
public class BerandaControler {
		@Autowired
		IMahasiswaService mahasiswaService;
		
		@RequestMapping("/header")
		public String beranda() {
			return "/beranda";
		}
		
		//@RequestBody for JSON
		//@PathVariable for url
		//@ResponseBody for data return
		
		@PostMapping("/post")
		private MahasiswaModel post(@RequestBody MahasiswaModel mahasiswaModel) {
			// TODO Auto-generated method stub
			return mahasiswaService.insert(mahasiswaModel);
		}
		
		@PostMapping("/post/returncount")
		public String postCount (@RequestBody MahasiswaModel mahasiswaModel) {
			return mahasiswaService.insertCount(mahasiswaModel);
		}
		
		@GetMapping("/getall")
		public List<MahasiswaModel> getAll(){
			var result = mahasiswaService.findAll();
					
			return result
;		}
		
		@PutMapping("/update/")
		public ResponseEntity<String> updateMahasiswa (@RequestBody MahasiswaModel mahasiswaModel){
			mahasiswaService.updateById(mahasiswaModel);
			
			return ResponseEntity.status(HttpStatus.OK).body("Data Sudah Diupdate");
		}
		
		@GetMapping("/getById/{id}")
		public MahasiswaModel getById (@PathVariable int id) {
			var result = mahasiswaService.findById(id);
			return result;
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteMahasiswa(@PathVariable int id){
			
			mahasiswaService.deleteById(id);
			return ResponseEntity.status(HttpStatus.GONE).body("Data Sudah Terhapus");
		}
		
}
