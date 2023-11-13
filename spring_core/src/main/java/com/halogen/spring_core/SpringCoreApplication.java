package com.halogen.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.halogen.spring_core.Interface.TaxCalculator;
import com.halogen.spring_core.Interface.TaxCalculator2023;
import com.halogen.spring_core.Interface.TaxReport;
import com.halogen.spring_core.dependencyInjection.CricketPlayer;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

		System.out.println("----------- spring core practice ------------");

		TaxCalculator tax2023 = new TaxCalculator2023(555);
		TaxReport report = new TaxReport(tax2023);

		report.show();

		System.out.println("----------- spring core practice ------------");
	}
}
