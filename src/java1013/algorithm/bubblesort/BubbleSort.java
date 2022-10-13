package java1013.algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort {
   public int[] sort(int[] arr){
       for(int i = 0; i < arr.length - 1; i++){
           for(int j = i+1; j < arr.length; j++){
               if(arr[i] > arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }

       return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{7,2,3,9,28,11};
        arr = bubbleSort.sort(new int[]{2,7,3,9,28,11});
        System.out.println(Arrays.toString(arr));
    }
}
