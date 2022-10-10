package codeup;

import java.util.Scanner;

public class Codeup_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = Integer.parseInt(a, 16);
        String c = Integer.toOctalString(b);

        System.out.println(c);
    }
}
