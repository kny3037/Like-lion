package java1014.algorithm;

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr, int i){  //i를 파라미터로.
        //i = 1 arr[1]j vs arr[0]
        //i = 2 일때 arr[2]j vs arr[1]
        //i = 2 일때 arr[1]j vs arr[0]
        //바꿔주는 것이 j가 되는 것.

        for(int j = i; j > 0; j--){
            System.out.printf("i : %d j : %d j-1 : %d\n",i,j,j-1);
            /*if (arr[i] < arr[i - 1]) {  //arr[1] vs arr[0]
                //swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }   */
        }


        return arr;
    }
    public static void main(String[] args) {
        //5에서 출발!
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort02 is = new InsertionSort02();
        arr = new int[] {5, 8, 6, 2, 4};
        int[] result = is.sort(arr, 1);

        System.out.println(Arrays.toString(result));

    }
}
