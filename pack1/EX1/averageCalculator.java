package pack1.EX1;

import java.util.Scanner;

public class averageCalculator {

    public int calculateAverage(int[] numbers){
        int sum=0 ;
         for (int num : numbers){
             sum += num;
         }
         return sum / numbers.length;
    }
}
