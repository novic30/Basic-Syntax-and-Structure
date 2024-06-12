import java.util.Scanner;
import java.lang.Math.*;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Temperature in Fahrenheit(only give integer value): ");
        int Fr = Integer.parseInt(scanner.nextLine().trim());
        double Celciusvalue = (Fr-32)*(5.0/9.0);
        double roundOff = (double) Math.round(Celciusvalue * 100) / 100;

        System.out.println("Temperature in Celcius: " + roundOff);
    }
}
