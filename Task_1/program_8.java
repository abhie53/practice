package Task_1;
import java.util.Scanner;

public class program_8 {
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }
}
