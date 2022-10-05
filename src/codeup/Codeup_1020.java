package codeup;

import java.util.Scanner;

public class Codeup_1020 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String num = scr.nextLine();
        num = num.replace("-","");

        System.out.println(num);
    }
}
