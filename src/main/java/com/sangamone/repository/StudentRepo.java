package com.sangamone.repository;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

	

	
}
