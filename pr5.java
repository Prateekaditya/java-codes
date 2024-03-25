import java.util.Scanner;

public class pr5 {
    // Method to calculate area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a triangle
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of a square
    public static double squareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User chooses the shape
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        // Variables to store dimensions
        double radius, base, height, sideLength;

        switch (choice) {
            case 1: // Circle
                System.out.println("Enter the radius of the circle:");
                radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + circleArea(radius));
                break;
            case 2: // Triangle
                System.out.println("Enter the base of the triangle:");
                base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + triangleArea(base, height));
                break;
            case 3: // Square
                System.out.println("Enter the side length of the square:");
                sideLength = scanner.nextDouble();
                System.out.println("Area of the square: " + squareArea(sideLength));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
