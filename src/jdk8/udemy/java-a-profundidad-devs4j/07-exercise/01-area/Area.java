public class Area {

  public static void main (String args []) {
    // Square
    int squareHeight = 5;
    int squareArea = squareHeight * squareHeight;
    System.out.println("Square area: " + squareArea);

    // Circule
    int circleRadio = 7;
    double circleArea = 3.1416 * circleRadio * circleRadio;
    System.out.println("Circle area: " + circleArea);

    // Rectangle
    int rectangleHeight = 3;
    int rectangleBase = 9;
    int rectangleArea = rectangleHeight * rectangleBase;
    System.out.println("Rectangle area: " + rectangleArea);

    // Triangle
    int triangleHeight = 7;
    int triangleBase = 5;
    double triangleArea = triangleHeight * triangleBase / 2.0;
    System.out.println("Triangle area: " + triangleArea);
  }
}
