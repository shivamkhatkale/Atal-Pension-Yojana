package com.ubi.app.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ubi.app.entity.CbsData;
import com.ubi.app.repo.ApyAccountRepo;

@Component
public class Account implements ApplicationRunner{
	
	@Autowired
	private ApyAccountRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	     CbsData customer1 = new CbsData("Amit Sharma", LocalDate.parse("12-03-1988"), "Male", 9876543210L, 123456789012L, "101 MG Road", "Sector 1", null, "Delhi Branch");
	     CbsData customer2 = new CbsData("Priya Verma", LocalDate.parse("25-07-1990"), "Female", 8765432109L, 234567890123L, "23 Nehru St", "Block B", "Near Park", "Mumbai Branch");
	     CbsData customer3 = new CbsData("Rahul Joshi", LocalDate.parse("10-11-1985"), "Male", 7654321098L, 345678901234L, "56 Park Avenue", "Floor 2", "", "Pune Branch");
	     CbsData customer4 = new CbsData("Sneha Iyer", LocalDate.parse("14-02-1992"), "Female", 6543210987L, 456789012345L, "78 Residency Road", "Block C", "Opp Temple", "Bangalore Branch");
	     CbsData customer5 = new CbsData("Vikram Singh", LocalDate.parse("01-01-1980"), "Male", 5432109876L, 567890123456L, "9 MG Layout", "Lane 3", null, "Chennai Branch");
	     CbsData customer6 = new CbsData("Meena Kumari", LocalDate.parse("22-05-1995"), "Female", 4321098765L, 678901234567L, "33 Lakeview", "Sector 9", "Flat 5B", "Hyderabad Branch");
	     CbsData customer7 = new CbsData("Anil Mehta", LocalDate.parse("18-08-1975"), "Male", 3210987654L, 789012345678L, "120 Palm St", "3rd Cross", null, "Ahmedabad Branch");
	     CbsData customer8 = new CbsData("Riya Das", LocalDate.parse("03-09-1993"), "Female", 2109876543L, 890123456789L, "44 College Rd", "Flat 101", "Near Library", "Kolkata Branch");
	     CbsData customer9 = new CbsData("Siddharth Patel", LocalDate.parse("17-12-1987"), "Male", 1987654321L, 901234567890L, "87 Beach Road", "Tower A", "", "Goa Branch");
	     CbsData customer10 = new CbsData("Neha Kulkarni", LocalDate.parse("30-06-1991"), "Female", 1098765432L, 123098765432L, "55 Sunrise Apt", "5th Floor", "Beside Mall", "Nagpur Branch");

	     
	     List<CbsData> customers = Arrays.asList(
	    		    customer1, customer2, customer3, customer4, customer5,
	    		    customer6, customer7, customer8, customer9, customer10
	    		);
	     
	     repo.saveAll(customers);

	    		
	}
	
}
