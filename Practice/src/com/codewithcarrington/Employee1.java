package com.codewithcarrington;

public class Employee1 {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    //Getters and setters for BaseSalary//
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    //Getters and Setters for hourlyRate//
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be more than 0");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
