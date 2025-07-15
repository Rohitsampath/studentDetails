package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.StudentInfo;
import com.nit.repo.IStudentRepo;

@Service
public class StudentImplService implements IStudentService{

	@Autowired
	private IStudentRepo stuInfo;
	@Override
	public StudentInfo registerStuInfo(StudentInfo stu) {
		stuInfo.save(stu);
		return stu;
	}
	@Override
	public List<StudentInfo> feachAllInfo() {
	
		return stuInfo.findAll();
	}
	@Override
	public Optional<StudentInfo> findById(int id) {
	
		return stuInfo.findById(id);
	}

}
