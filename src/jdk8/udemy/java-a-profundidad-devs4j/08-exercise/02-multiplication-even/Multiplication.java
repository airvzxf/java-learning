class Multiplication {

  public static void main(String[] args) {
    for (int multiplicand = 1; multiplicand <= 20; multiplicand++) {
      for (int multiplier = 1; multiplier <= 10; multiplier++) {
        if (multiplier % 2 != 0) {
          continue;
        }
        System.out.println(multiplicand + " x " + multiplier + " = " + (multiplicand * multiplier));
      }
      System.out.println("\n");
    }
  }
}
