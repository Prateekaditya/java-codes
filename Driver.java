import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.subtract(10, 5);
        System.out.println("Subtraction of integers: " + result1);

        double result2 = calculator.subtract(3.14, 1.59);
        System.out.println("Subtraction of doubles: " + result2);

        int result3 = calculator.subtract(20, 10, 5);
        System.out.println("Subtraction of three integers: " + result3);

        Integer result4 = calculator.subtract(15, 8);  
        System.out.println("Subtraction using generic method (Integer): " + result4);
        Double result5 = calculator.subtract(4.25, 1.75);  
        System.out.println("Subtraction using generic method (Double): " + result5);
    }
}
