// Write a program to demonstrate package concept

import pack.*; // Importing the class from the package

public class exp6 {
    public static void main(String[] args) {
        // Creating object of the first class from the package
        exp6_1 obj = new exp6_1();
        obj.display();

        // Creating object of the second class from the package
        exp6_2 obj2 = new exp6_2();
        obj2.display();
    }
}