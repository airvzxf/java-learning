public class Identifier {

  public static void main(String args[]) {
    // The identifier (variable or constant) start with alphabet, underscore, dolar signal.
    double salary = 100000.45;
    double _salary = 100000.45;
    double $salary = 100000.45;
    double $_salary = 100000.45;
    double $ = 100000.45;

    // Invalid identifiers
    // double _ = 100000.45;
    // double salary = 100000.45;
    // double ~salary = 100000.45;
    // double !salary = 100000.45;
  }
}
