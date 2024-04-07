import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        validateTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void validateTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours. Hours must be between 0 and 24.");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes. Minutes must be between 0 and 60.");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds. Seconds must be between 0 and 60.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter hours (0-24): ");
            int hours = scanner.nextInt();
            System.out.print("Enter minutes (0-60): ");
            int minutes = scanner.nextInt();
            System.out.print("Enter seconds (0-60): ");
            int seconds = scanner.nextInt();

            Time time = new Time(hours, minutes, seconds);

            System.out.println("Time: " + time.hours + ":" + time.minutes + ":" + time.seconds);
        } catch (HrsException | MinException | SecException e) {
            e.printStackTrace();

        } 
    }
}
