package com.codewithcarrington;

public class TextBoxMain {
    public static void main(String[] args) {
//        TextBox1 textBox2 = new TextBox1(); //new instance to TextBox1
//        textBox2.setText("Box2"); //Uses the setText method from TextBox1 class
//        System.out.println(textBox2.text.toUpperCase());
//
//        TextBox1 textBox3 = new TextBox1();
//        textBox3.setText("Box3");
//        System.out.println(textBox3.text);
//
//        TextBox1 textBox4 = textBox2;
//        textBox4.setText("Hello World");
//        System.out.println(textBox2.text);//Prints out Hello World. Line 14 we changed the text
//        System.out.println(textBox4.text);//Also prints out Hello World.

        //---Writing a program to calculate wage of employees--//
        var employee2 = new Employee1(75_000);//Does not need second parameter due to overloading constructor in employee1 class.
        var employee = new Employee1(50_000, 20); // We can delete code on line 21 and 22 since we set constructors
//        employee.setBaseSalary(50_000); //Need this setter because BaseSalary is private in Employee1 class. In order to run program need to get and set.
//        employee.setHourlyRate(20);
        int wage = employee.calculateWage(); // This method is in Employee1 class
        System.out.println(wage);
        Employee1.printNumberOfEmployees();

        //---Reducing Coupling---//
        var browser1 = new Browser1();
        browser1.navigate("123 Alamo St. SATX");


    }
}
