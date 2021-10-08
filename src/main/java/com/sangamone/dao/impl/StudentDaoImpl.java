package com.sangamone.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sangamone.dao.StudentDao;
import com.sangamone.entity.StudentEntity;
import com.sangamone.repository.StudentRepo;

@Service
@Transactional
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	StudentRepo studentrepo;
	@Override
	public boolean save(StudentEntity student) {
		boolean flag = false;
		if (student != null) {
			studentrepo.save(student);
			flag = true;

		}
		return flag;
		
		
		
	}
	}



