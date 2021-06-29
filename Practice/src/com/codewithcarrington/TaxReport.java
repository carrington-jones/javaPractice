package com.codewithcarrington;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) { //Here TaxReport has parameter of TaxCalculator Interface
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
