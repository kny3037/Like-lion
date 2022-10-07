package codeup;

import java.util.Scanner;

public class Codeup_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++){
            System.out.printf("\'%s\'\n", a.charAt(i));
        }

    }
}
