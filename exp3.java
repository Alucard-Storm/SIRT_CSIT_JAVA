// Write a program to demonstrate function overloading for calculating of average

public class exp3 {
    // Function to calculate average of two integers
    static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    // Function to calculate average of three integers
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        // Calculate and print average of two numbers
        double avgTwo = average(num1, num2);
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + avgTwo);

        // Calculate and print average of three numbers
        double avgThree = average(num1, num2, num3);
        System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avgThree);
    }
}
