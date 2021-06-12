package com.codewithcarrington;

public class TextBoxMain {
    public static void main(String[] args) {
        TextBox1 textBox2 = new TextBox1(); //new instance to TextBox1
        textBox2.setText("Box2"); //Uses the setText method from TextBox1 class
        System.out.println(textBox2.text.toUpperCase());

        TextBox1 textBox3 = new TextBox1();
        textBox3.setText("Box3");
        System.out.println(textBox3.text);

        TextBox1 textBox4 = textBox2;
        textBox4.setText("Hello World");
        System.out.println(textBox2.text);//Prints out Hello World. Line 14 we changed the text
        System.out.println(textBox4.text);//Also prints out Hello World.
    }
}
