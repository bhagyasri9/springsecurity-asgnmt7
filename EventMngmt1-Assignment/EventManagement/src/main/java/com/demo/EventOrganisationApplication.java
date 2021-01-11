package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.repos.Event;
import com.demo.service.EventService;

@SpringBootApplication
public class EventOrganisationApplication implements CommandLineRunner{

	@Autowired
	private EventService eventService;
	
	public static void main(String[] args) {
		SpringApplication.run(EventOrganisationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=fmt.parse("10/01/2021");
		Date d2=fmt.parse("20/01/2021");
		Date d3=fmt.parse("5/12/2020");
		
		Event e1=new Event("Drawing", "pune", d1, 11, 20);
		Event e2=new Event("Dancing", "banglore", d2, 7, 10);
		Event e3=new Event("Singing", "chennai", d3, 12, 15);
		
		eventService.addEvent(e1);
		eventService.addEvent(e2);
		eventService.addEvent(e3);
		
	}

}
