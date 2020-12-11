package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.StrictMath.pow;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        int x = Integer.valueOf(reader.readLine());
        if ( x >= 5 ){
            System.out.printf("Y = %f", (pow(x,2)-10)/(x+7));
        } else if ( -3 < x && x < 5){
            System.out.printf("Y = %f", (x+3)*(pow(x,2)-2));
        } else {
            System.out.println("Y = 420");
        }
    }
}
