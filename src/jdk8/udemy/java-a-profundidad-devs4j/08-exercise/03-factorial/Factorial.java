class Factorial {

  public static void main(String[] args) {
    int input = 0;
    int factorial = 1;

    if (input < 0) {
      System.out.println("The input value should be greater than zero.");

      for (; input > 1; input--) {
        factorial *= input;
      }

      System.out.println(input + "! = " + factorial);
    }
  }
}
