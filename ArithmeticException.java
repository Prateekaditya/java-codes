class ArithmeticException{
    public static void main(String[] args){
        try {
            int numerator = 9;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
	catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } 

    }
}