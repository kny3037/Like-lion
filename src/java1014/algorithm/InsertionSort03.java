package java1014.algorithm;

import java.util.Arrays;

public class InsertionSort03 {
    public int[] sort(int[] arr){
        for (int i = 1; i<arr.length; i++){
            for(int j = i; j > 0; j--){
          //      System.out.printf("i : %d j : %d j-1 : %d\n",i,j,j-1);
            if (arr[i] < arr[i - 1]) {  //arr[1] vs arr[0]
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        //5에서 출발
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort03 is = new InsertionSort03();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
