package com.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.StudentInfo;
import com.nit.service.IStudentService;

@RestController
@RequestMapping("/home")
public class StudentCntroller {
	
	@Autowired
	private IStudentService service;
	
	@PostMapping("/register")
	public ResponseEntity<StudentInfo>  enroll(@RequestBody StudentInfo info)
	{
		try {
		StudentInfo msg=service.registerStuInfo(info) ;
		return new ResponseEntity<StudentInfo>(msg,HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity("problem is fetching",HttpStatus.INTERNAL_SERVER_ERROR);
					
	}
	}
	@GetMapping("/show")
	public ResponseEntity<?> showAllData()
	{
		try {
		List<StudentInfo> msg=service.feachAllInfo();
	
		//return  new ResponseEntity<String>(msg,HttpStatus.OK);
		return  new ResponseEntity<List<StudentInfo>> (msg,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<String>("problem is fetching tourist",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/findById")
	public ResponseEntity<?> showDataById(@RequestParam int id) {
	    try {
	        Optional<StudentInfo> msg = service.findById(id);
	        if (msg.isPresent()) {
	            return new ResponseEntity<StudentInfo>(msg.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<String>("Student not found", HttpStatus.NOT_FOUND);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<String>("Problem fetching student", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}


}

