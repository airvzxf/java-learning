class DataTypes {

  public static void main(String args[]) {
    // The variable or constant name is know as a identifier.
    // The value is know as a literal.

    // Variable, integer
    int age = 18;
    System.out.println("My age is " + age);
    age = 19;
    System.out.println("My age is " + age);
    age = 20;
    System.out.println("My age is " + age);

    // Constant, integer
    final int newAge = 18;
    System.out.println("My new age is " + newAge);
    // DataTypes.java:15: error: cannot assign a value to final variable newAge
    // newAge = 19;
    // System.out.println("My new age is " + newAge);

    // All types
    boolean isActive = true;
    byte items = 5;
    short power = 5021;
    char character = 'Z';
    int size = 12341354;
    // The literal for the decimal 123.45 is always double, for float add "F" in lowercase or upppercase.
    float surface = 21564.145F;
    // The literal for the decimal 12345 is always integer, for long add "L" in lowercase or upppercase.
    long length = 4545498586545812L;
    double grown = 1213454541.2415;
  }
}
