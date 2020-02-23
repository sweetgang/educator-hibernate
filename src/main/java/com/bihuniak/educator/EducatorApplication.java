package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.basic.human.*;
import com.bihuniak.educator.company.DepartmentRepository;
import com.bihuniak.educator.company.Dpartment;
import com.bihuniak.educator.company.Employee;
import com.bihuniak.educator.company.EmployeeReposytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeReposytorium  employeeReposytorium;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		Dpartment dpartment = new Dpartment("Javga", "Daszynskiego", 67);
//		Employee employee = new Employee("Baszyk", "Customer",dpartment);
//		dpartment.setEmployee(employee);
//
//		employeeReposytorium.save(employee);

		System.out.println(employeeReposytorium.findById(5L).get());
	}
}
