package codeup;

import java.util.Arrays;

public class Codeup_4596 {
    public static void main(String[] args) {
        int [][] arr = new int[][]{

                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80},

        };
        //loop를 돌아야 한다. 9 * 9
        int maxValue = arr[0][0];
        int[] maxIdx = {0,0}; //i,j
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                // int b = arr[j][i]; // 2 : 만약 2번이라면?세로 라인이 출력됨.
                int nowValue = arr[i][j]; // 1   1,2 중 뭐가 맞는 걸까? 1번이 맞는 것.
                // j가 0~9까지 한 번 돌면 i가 1씩 올라감.
           //     System.out.println(a);  //for문의 i를 1로 두면 첫번째 가로 라인이 출력됨
                if(nowValue > maxValue){
                    maxValue = arr[i][j];
                    maxIdx[0] = i + 1;
                    maxIdx[1] = j + 1;
                }

            }
        }
        System.out.println(maxValue);
        System.out.println(Arrays.toString(maxIdx));
    }
}
