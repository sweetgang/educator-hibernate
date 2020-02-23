package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.basic.human.*;
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
	private MyFirstRepository myFirstRepository;

	@Autowired
	private HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<String> numerTelefonuw = new ArrayList<String>();
		numerTelefonuw.add("56898936");
		numerTelefonuw.add("99395466");
		numerTelefonuw.add("230005409");
		numerTelefonuw.add("3488840045");

		List<Addres> listaAdresuw= new ArrayList<Addres>();
		listaAdresuw.add(new Addres("Wagonowa","Wroclaw","Poland"));
		listaAdresuw.add(new Addres("Sztrybnicka","Wroclaw","Poland"));
		listaAdresuw.add(new Addres("Kalkuta","Wroclaw","Poland"));


		Human januzs = new Human("Janush", "Wyshniecki",
				Sex.SECRET, LocalDate.of(1984, 04,23),
				listaAdresuw,
				numerTelefonuw);
		humanRepository.save(januzs);

		//Car car = myFirstRepository.findById(8L).get();
		//System.out.println(car);
	}
}
