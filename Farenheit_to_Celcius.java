import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion: Fahrenheit to Celsius");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
