public class OddEvenPrinter {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i += 2) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 20; i += 2) {
                    System.out.println("Even Thread: " + i);
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}