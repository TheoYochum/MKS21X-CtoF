//The functions should each take in a temperature value that could be an int or double based on how we want it to function, I will probably do doubles
//The functions should both return an int or double depending on how we want it to function I will likely do a double as it will only divide by 3
import java.util.Scanner;

public class CtoFTester {
  public static void main(String[] args) {
    double x;
    Scanner in = new Scanner(System.in);
    x = in.nextDouble();

    System.out.println(celsiusToFahrenheit(x));
    //System.out.println(fahrenheitToCelsius(x));
  }

  public static double celsiusToFahrenheit(double input) {
    return (input * (9.0 / 5.0) + 32);
  }

  public static double fahrenheitToCelsius(double input) {
    return 0;
  }
}
