package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangamone.dao.StudentDao;
import com.sangamone.entity.StudentEntity;

@Controller
public class StudentController {
	@Autowired
	StudentDao studentdao;
	
	
	@RequestMapping("/test")
	public String Home() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/setStudent")
	public String setData(StudentEntity student) {
		studentdao.save(student);

		if(student!= null) {
			
			return "sucess.jsp";
		}
		else {
			return "error.jsp";
		}
	}

}
