package codeup;

import java.util.Scanner;

public class Codeup_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String hexS = Integer.toHexString(num);

        System.out.println(hexS);
    }
}
