package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("1: ");
        int a = Integer.valueOf(reader.readLine());
        System.out.printf("2: ");
        int b = Integer.valueOf(reader.readLine());
        while (a <= b) {
            if ((a % 5 == 0) && (a % 10 != 0)) {
                System.out.printf("%d%n", a);
            }
            a += 1;
        }
    }
}
