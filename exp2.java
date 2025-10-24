// Write a program to calculate addition of two numbers using prototyping of method

public class exp2 {
    // prototype of method
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // call the method
        int sum = add(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
