import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class NumberArray {
    int[] numbers;
    int size;

    public NumberArray(int size) {
        this.numbers = new int[size];
        this.size = size;
    }

    public void sortOddEven() {
        int oddIndex = 0, evenIndex = size - 1;
        while (oddIndex < evenIndex) {
            while (oddIndex < evenIndex && numbers[oddIndex] % 2 != 0) {
                oddIndex++;
            }
            while (oddIndex < evenIndex && numbers[evenIndex] % 2 == 0) {
                evenIndex--;
            }
            if (oddIndex < evenIndex) {
                // Swap odd and even numbers
                int temp = numbers[oddIndex];
                numbers[oddIndex] = numbers[evenIndex];
                numbers[evenIndex] = temp;
            }
        }
        Arrays.sort(numbers, 0, oddIndex);  // Sort odd numbers
        Arrays.sort(numbers, oddIndex, size);  // Sort even numbers
    }

    public void printDuplicates() {
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;  // Print each duplicate only once
                }
            }
        }
        System.out.println();
    }
}

public class NumberFileOperations {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter lower bound (lb): ");
        int lb = scanner.nextInt();

        System.out.print("Enter upper bound (ub): ");
        int ub = scanner.nextInt();

        // Generate and store random numbers in a file
        try (PrintWriter writer = new PrintWriter("random-numbers.txt")) {
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                int number = random.nextInt(ub - lb + 1) + lb;
                writer.println(number);
            }
        }

        // Read numbers from file into NumberArray
        NumberArray array = new NumberArray(n);
        try (BufferedReader reader = new BufferedReader(new FileReader("random-numbers.txt"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                array.numbers[i++] = Integer.parseInt(line);
            }
        }

        // Rearrange, display, and find duplicates
        array.sortOddEven();
        System.out.println("Sorted array: " + Arrays.toString(array.numbers));
        array.printDuplicates();

        // Store sorted elements in another file
        try (PrintWriter writer = new PrintWriter("sorted-numbers.txt")) {
            for (int number : array.numbers) {
                writer.println(number);
            }
        }
    }
}
