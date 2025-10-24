// Write a program to demonstrate exception handling in case of division by zero

public class exp7 {
    public static void main(String[] args) {

        // Division by zero example
        int a = 10;
        int b = 0;

        // Exception handling
        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) { // Catching the exception
            System.out.println("Error: Division by zero is not allowed."); // Handling the exception
        }
    }
}