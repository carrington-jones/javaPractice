package com.codewithcarrington;

public class TaxReport {
    private TaxCalculator calculator;



//    public TaxReport(TaxCalculator calculator) { //Here TaxReport has parameter of TaxCalculator Interface
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
