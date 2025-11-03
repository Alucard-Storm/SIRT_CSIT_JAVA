// Write a program to show the detail of students using concept of inheritance

import java.util.Scanner;

class Student {
    String name, roll_number, branch;
    int age;

    // Display Student details
    void display()
    {
        System.out.println("Student name is "+name);
        System.out.println("Student age is "+age);
        System.out.println("Student Roll Number is "+roll_number);
        System.out.println("Student Branch is "+branch);
    }
}

class StudentDetails extends Student // StudentDeatils inherits class Student
{
    Scanner sc = new Scanner(System.in);

    // Input Student details
    void input()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll_number = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        sc.close();
    }
    
}

public class exp5 {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.input();
        sd.display();
    }
}