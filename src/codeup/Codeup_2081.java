package codeup;

import java.util.Scanner;

public class Codeup_2081 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;

        int Idx = 0;

        for(int i =0; i<arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
                Idx = i + 1;
            }
        }
        System.out.println(maxValue);
        System.out.println(Idx);
    }
}
