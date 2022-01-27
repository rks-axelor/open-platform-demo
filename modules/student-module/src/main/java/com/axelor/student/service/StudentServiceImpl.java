package com.axelor.student.service;

import java.time.LocalDate;
import java.time.Period;
import com.axelor.student.db.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void validateDOB(Student student) {
		System.err.println("inside StudentService impl class");
		LocalDate dob = student.getDateOfBirth();
		LocalDate curDate = LocalDate.now();
		Period period = Period.between(dob, curDate);
		int p = period.getYears();
		if(p<=18) {
			System.err.println("Age is less than 18");
		}
		else {
			System.err.println("age is greater than 18");
		}
	}

}
