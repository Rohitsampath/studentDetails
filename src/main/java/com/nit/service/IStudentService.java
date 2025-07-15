package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.StudentInfo;

public interface IStudentService {
	public StudentInfo registerStuInfo(StudentInfo stu);
	public List<StudentInfo> feachAllInfo();
	public Optional<StudentInfo> findById(int id);
	

}
