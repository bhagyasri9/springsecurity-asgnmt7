package com.eventapp;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.eventapp.repo.Event;
import com.eventapp.repo.EventUser;
import com.eventapp.service.EventService;
import com.eventapp.service.EventUserService;

@Component
public class DataInitializer implements CommandLineRunner{

	@Autowired
	private EventService eService;
	
	@Autowired
	private EventUserService userService;
	@Override
	public void run(String... args) throws Exception {

		
		Event event1=new Event("Cooking", "Mumbai", 700.00, LocalDate.of(2021,Month.JANUARY,20), 10, 15);
		Event event2=new Event("Dancing kuchipudi", "Karnataka", 400.00, LocalDate.of(2021,Month.JANUARY,26), 15, 20);
		Event event3=new Event("Drawing", "Nagpur", 400.00, LocalDate.of(2021,Month.FEBRUARY,3), 10, 17);
		Event event4=new Event("ClassicalDance", "Chennai", 700.00, LocalDate.of(2021,Month.MARCH,8), 15, 25);
		Event event5=new Event("Singing", "pune", 600.00, LocalDate.of(2021,Month.APRIL,21), 10, 18);
		
		eService.addEvent(event1);
		eService.addEvent(event2);
		eService.addEvent(event3);
		eService.addEvent(event4);
		eService.addEvent(event5);
		
		
		EventUser users1=new EventUser("raj","raj123",Arrays.asList("ROLE_ADMIN"));
		
		EventUser users2=new EventUser("john","john123",Arrays.asList("ROLE_CLERK"));
		
		userService.addUser(users1);
		userService.addUser(users2);
	}

}
