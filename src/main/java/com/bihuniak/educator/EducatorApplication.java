package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Car car = new Car("A4","Audi",4,2,false);
		Car car2 = new Car("A45","Audi",4,2.1,true);
		Car car3 = new Car("X5","BMW",4,2,false);
		Car car4 = new Car("C300","Mecedes",4,2,false);
		myFirstRepository.saveAll(Arrays.asList(car,car2,car3,car4));

		//Car car = myFirstRepository.findById(8L).get();
		//System.out.println(car);
	}
}
