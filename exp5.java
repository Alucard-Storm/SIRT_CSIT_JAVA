// Write a program to show the detail of students using concept of inheritance

import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor for Person class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String roll_no;
    String branch;

    // Constructor for Student class
    Student(String name, int age, String roll_no, String branch) {
        super(name, age);
        this.roll_no = roll_no;
        this.branch = branch;
    }

    // Method to display student details
    void displayDetails() {
        display();
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Branch: " + branch);
    }
}

public class exp5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input details
        String name, roll_no, branch;
        int age;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();

        // Create Student object and display details
        Student student = new Student(name, age, roll_no, branch);
        student.displayDetails();

        // Close the scanner
        sc.close();
    }
}

/* Here this keyword is used for initilizing the variable from argument  and super keyword is used to call the parent class constructor */