package codeup;

import java.util.Scanner;

public class Codeup_1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int num = sc.nextInt();
        while (num > 0){
            num /= 10;
            cnt++;
        }
        System.out.println(cnt);


    }
}
