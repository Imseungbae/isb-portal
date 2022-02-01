package com.pro.isbportal;

import com.pro.isbportal.practice.Cage;
import com.pro.isbportal.practice.Tiger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class IsbPortalApplication {

	public static void main(String[] args) {
//		SpringApplication.run(IsbPortalApplication.class, args);
		Cage<Tiger> ct = new Cage<>();
		ct.list.add(new Tiger());
		ArrayList<Object> str = new ArrayList<>();

		str.add("1");
		str.add(1);



		System.out.println("ct= " + ct.list);
	}

}
