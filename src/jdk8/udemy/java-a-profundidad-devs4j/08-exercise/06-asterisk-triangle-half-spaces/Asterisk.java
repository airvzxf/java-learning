class Asterisk {

  public static void main(String[] args) {
    int maxSize = 5;

    for (int base = 1; base <= maxSize; base++) {
      for (int index = 0; index < maxSize; index++) {
        if (index + base < maxSize) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println("");
    }
  }
}
