// Write a program that accepts two numbers from the user and print their sum

import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner Sc = new Scanner(System.in);

        // take user input for two integers
        System.out.print("Enter the value of A: ");
        int num1 = Sc.nextInt();
        System.out.print("Enter the value of B: ");
        int num2 = Sc.nextInt();

        // print the sum of two integers
        System.out.println("A + B = " + (num1 + num2));
        
        // close the scanner
        Sc.close();
    }
}
