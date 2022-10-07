package codeup;

import java.util.Scanner;

public class Codeup_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] A = a.toCharArray();

        for (int i = 0; i<A.length; i++){
            System.out.print("["+A[i]);
            for (int j = A.length-1; j > i; j--){
                System.out.print("0");
            }
            System.out.print("]\n");
        }
    }
}
