package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.basic.human.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	@Autowired
	private HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Human januzs = new Human("Janush", "Wyshniecki",
				Sex.SECRET, LocalDate.of(1984, 04,23),
				new Addres("Wagonowa","Wroclaw","Poland",new PostCode(44,"-444")));
		humanRepository.save(januzs);

		//Car car = myFirstRepository.findById(8L).get();
		//System.out.println(car);
	}
}
