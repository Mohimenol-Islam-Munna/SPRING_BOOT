package com.halogen.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.halogen.spring_core.Interface.TaxCalculator;
import com.halogen.spring_core.Interface.TaxCalculator2023;
import com.halogen.spring_core.Interface.TaxReport;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		System.out.println("----------- spring core practice ------------");

		// dependancy injection
		TaxCalculator tax2023 = new TaxCalculator2023(555);
		TaxCalculator tax2024 = new TaxCalculator2023(5001);
		TaxReport report = new TaxReport(tax2023);

		report.show();
		System.out.println("after 1st print");
		report.setTaxCalculator(tax2024);
		report.show();

		// IoC

		System.out.println("----------- spring core practice ------------");
	}
}
