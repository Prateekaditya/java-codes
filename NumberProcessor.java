import java.util.Scanner;
class NumberProcessor {
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
    public static void processInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("Negative number entered!");
        } else {
            double doubleValue = (double) number;
            System.out.println("Double value of the entered number: " + doubleValue);
        }
    }

    public static void main(String[] args) {
        try {
            processInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
