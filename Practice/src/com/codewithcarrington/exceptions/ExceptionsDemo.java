package com.codewithcarrington.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {

        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        } catch (IOException e) {
            System.out.println("Could not read data.");
        }


    }

}

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
