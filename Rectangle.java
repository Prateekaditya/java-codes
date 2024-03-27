import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    void display() {
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.read();
        rect.calculate();
    }
}
