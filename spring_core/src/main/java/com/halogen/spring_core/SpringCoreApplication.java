package com.halogen.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.halogen.spring_core.dependencyInjection.Club;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

		System.out.println("----------- spring core practice ------------");
		Club manCity = new Club("Manchester city", "Manchester", "England");

		System.out.println("club name :" + manCity.name);
		System.out.println("club country :" + manCity.country);
		System.out.println("club trophy :" + manCity.trophy);

		System.out.println("----------- spring core practice ------------");

	}

}
