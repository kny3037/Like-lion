package codeup;

import java.util.Scanner;

public class Codeup_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ymd = sc.next().split("\\.");

        System.out.println(ymd[2]+"-"+ymd[1]+"-"+ymd[0]);


    }
}
