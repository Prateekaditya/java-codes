class CheckArgumentException extends Exception{
  public CheckArgumentException(String message) {
    super(message);
  }
}
class CalculateSumOfSquares{
  public static void main(String[] args) throws CheckArgumentException {
    if (args.length < 4) {
      throw new CheckArgumentException("Please provide at least four arguments");
    }
    int sumOfSquares = 0;
    for (String arg : args) {
      try {
        int number = Integer.parseInt(arg);
        sumOfSquares += number * number;
      } catch (NumberFormatException e) {
        System.out.println("Invalid argument: " + arg + ". Please enter only numbers.");
      }
    }
    System.out.println("Sum of squares: " + sumOfSquares);
  }
}
