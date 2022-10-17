package codeup;

import java.util.Scanner;

public class Codeup_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long sum = a + b + c;
        float average = (float) sum/3;

        System.out.println(sum);
        System.out.printf("%.1f",average);
    }
}
