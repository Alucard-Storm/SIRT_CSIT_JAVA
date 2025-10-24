// Write a program to demonstrate overloaded constructor for calculating box volume

public class exp4 {
    double length;
    double width;
    double height;

    // Overloaded constructor with three parameters
    exp4(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Overloaded constructor with two parameters
    exp4(double l, double w) {
        length = l;
        width = w;
        height = 1.0; // Default height
    }

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Using overloaded constructor with three parameters
        exp4 box1 = new exp4(10.0, 5.0, 2.0);
        // Using overloaded constructor with two parameters
        exp4 box2 = new exp4(8.0, 4.0);

        // Calculate and print volumes
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
    }
}
