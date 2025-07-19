package pack1.EX5;

import java.util.Scanner;
import java.lang.Math;

import static pack1.EX5.TemperatureConventer.celsiusToFahrenheit;

public class Main {
    public static void main(String[] args) {

        double[] celsiusTemps = {0, 10, 20, 30, 40};

        for (double temp : celsiusTemps){
            double fahrenheit = celsiusToFahrenheit(temp);
            double rounded = Math.round(fahrenheit * 10) / 10.0 ;
            System.out.printf("%.1f°C\t\t%.1f°F%n", temp, rounded);
        }
    }
}
