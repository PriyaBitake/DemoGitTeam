package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	

	@PostMapping("/saveData")
	public String saveData(@RequestBody Student s)
	{
		
		hs.saveData(s);
		return "Data Save Zala Re ba ";
	}
	
}
