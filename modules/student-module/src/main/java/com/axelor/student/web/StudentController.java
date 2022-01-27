package com.axelor.student.web;

import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Context;
import com.axelor.student.db.Student;
import com.axelor.student.db.repo.StudentRepository;
import com.axelor.student.service.StudentService;

public class StudentController { 
	
   public void checkPossibility(ActionRequest request,ActionResponse response) {
	   Context context = request.getContext();
	   Student student = context.asType(Student.class);
	   System.err.println(student);
		if(student.getId() != null) {
	        student= Beans.get(StudentRepository.class).find(student.getId());
		}
	   System.err.println(student);
	   Beans.get(StudentService.class).validateDOB(student); 
	   
   }
   
}
