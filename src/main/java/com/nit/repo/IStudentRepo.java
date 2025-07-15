package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.StudentInfo;

public interface IStudentRepo extends JpaRepository<StudentInfo, Integer> {
	

}
