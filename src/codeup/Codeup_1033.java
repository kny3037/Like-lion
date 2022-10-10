package codeup;

import java.util.Scanner;

public class Codeup_1033{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String upper = Integer.toHexString(num);

        System.out.println(upper.toUpperCase());
    }

}
