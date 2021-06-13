package com.codewithcarrington;

public class Employee1 {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee1(int baseSalary) { //Overloading this constructor allows us to implement a new employee object with only one parameter
        this(baseSalary, 0);
    }

    public Employee1(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){ //Static methods can only see other static methods. For example they cannot see calculateWage method.
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) { //Method overloading. This method and calculate wage method on line 21 have different parameters but same method. Once completed you can call calculate wages with or without parameters.
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
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
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate must be more than 0");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
