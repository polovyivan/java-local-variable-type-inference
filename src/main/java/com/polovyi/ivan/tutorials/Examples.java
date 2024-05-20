package com.polovyi.ivan.tutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.apache.commons.io.IOUtils;

public class Examples {

    // var wontCompile = new String(); // won't work

//    boolean isValid (var a) {return a==true;} // won't work
//    var isValid () {} // won't work

    void var() {
    }

    public static void main(String[] args) {

        var example1 = new String("string");
        var example2 = "string";

        // var example3; // won't work
        //var example4 = example4 + 1; // won't work
        // var example5 = null; // won't work
        var example6 = (Integer) null;

        var example7 = "example7";
        example7 = new String("new-example7");

        var example8 = "example8";
        //example8 = 0; // won't work

        final var example9 = "final variable";
        // example9 = "reassigned"; // won't work

        var arr = new String[]{"String1", "String2"};
        // var[] arrWithVAr = {"String1","String2"}; // won't compile
        // var arrWithVAr = {"String1","String2"}; // won't compile

        var example10 = List.of("string1", "string2");
        //List<String> example10 = List.of("string1", "string2"); // inferred by compiler

        var example11 = new ArrayList<String>();
        //ArrayList<String> example11 = new ArrayList<String>(); // inferred by compiler

        var example12 = new ArrayList<>();
        // ArrayList<Object> example11 = new ArrayList<>(); // inferred by compiler

        var example13 = Set.of(1, 2, 3);
        example13 = new HashSet<>();
        //example13 = List.of(1,2,3); // won't work
        //example13 =  Set.of("1","2","3"); // won't work

        List<?> example14 = List.of(1);
        Object example14FirstElement = example14.get(0);
        // example14.add(example14FirstElement); // won't work

        for (var i = 0; i < 1; i++) {
            System.out.println("i = " + i);
        }

        for (var i : List.of("forEach")) {
            System.out.println("i = " + i);
        }

        try (var inputStream = new FileInputStream("src/main/java/com/polovyi/ivan/tutorials/resources/test.txt")) {
            String everything = IOUtils.toString(inputStream);
            System.out.println("content of the file = " + everything);
        } catch (FileNotFoundException e) {
            System.out.println("BOOM!!!");
        } catch (IOException e) {
            System.out.println("BOOM!!!");
        }

        // var exampe15=1, exampe16=2; // won't work

        // class DemoClass {var exampe17=0;} // won't work

        // try {} catch (var e) {} // won't work

//        var example17 = a -> a.toUpperCase(); // won't work
//        var example18 = String::toUpperCase; // won't work
        Consumer<String> example17 = a -> a.toUpperCase();
        Consumer<String> example18 = String::toUpperCase;

        Consumer example19 = (var a) -> System.out.println("a = " + a);

        BiConsumer example21 = (var a, var b) -> System.out.println(a + " & " + b);
//        BiConsumer example22 = (var a, b) -> System.out.println(a +" & "+ b); // won't work
//        BiConsumer example23 = (var a, String b) -> System.out.println(a +" & "+ b); // won't work

        var var = "var";// :)
        // class var {}

        var example24 = new Object() {
            String firstName = "John";
            String lastName = "Doe";
        };
        example24.firstName = "John"; // it works

        Object example26 = new Object() {
            String firstName = "John";
            String lastName = "Doe";
        };
        // example26.firstName = "John"; // won't work

    }

}
