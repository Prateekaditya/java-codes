public class ArrayIndexOutofBoundsExample{

    public static void main(String[] args) {
        int[] numbers = {13, 21, 23, 412, 25};

        try {
            System.out.println(numbers[numbers.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
            System.out.println("Reason: " + e.getMessage());  
        }
    }
}