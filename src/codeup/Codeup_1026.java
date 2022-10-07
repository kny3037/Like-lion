package codeup;

import java.util.Scanner;

public class Codeup_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[]A = a.split("\\:");
        int b = Integer.parseInt(A[1]);

        System.out.printf("%d",b);
    }
}
