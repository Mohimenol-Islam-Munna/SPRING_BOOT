package com.halogen.spring_core.Interface;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        System.out.println("report :" + calculator.calculateTax());
    }
}
