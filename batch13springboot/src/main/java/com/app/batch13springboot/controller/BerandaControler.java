package com.app.batch13springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.batch13springboot.model.MahasiswaModel;
import com.app.batch13springboot.service.IMahasiswaService;
import com.app.batch13springboot.service.impl.MahasiswaService;

@Controller
public class BerandaControler {
		@Autowired
		IMahasiswaService mahasiswaService;
		
		@RequestMapping("/header")
		public String beranda() {
			return "/beranda";
		}
		
		@PostMapping("/post")
		private MahasiswaModel post(@RequestBody MahasiswaModel mahasiswaModel) {
			// TODO Auto-generated method stub
			return mahasiswaService.insert(mahasiswaModel);
		}
		
}
