package babe_lion;

public class ArrExercise {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //배열 arr에 2,4,6,8,10을 넣어보기
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        System.out.printf("0번에는 %d가 들어있습니다.\n",arr[0]);
        System.out.printf("1번에는 %d가 들어있습니다.\n",arr[1]);
        System.out.printf("2번에는 %d가 들어있습니다.\n",arr[2]);
        System.out.printf("3번에는 %d가 들어있습니다.\n",arr[3]);
        System.out.printf("4번에는 %d가 들어있습니다.\n",arr[4]);

        //배열에 5만원~10원까지.
        int[] arr2 = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        // new int[8] ==> 자동으로 해줌.
       /* arr2[0] = 50000;
        arr2[1] = 10000;
        arr2[2] = 5000;
        arr2[3] = 1000;
        arr2[4] = 500;    // 이걸 줄여서 축약형으로 20라인 처럼 적을 수 있다.
        arr2[5] = 100;
        arr2[6] = 50;
        arr2[7] = 10;*/

        /* //요걸 루프로 바꾸면? 41라인 처럼 변경 가능.
        System.out.printf("0번에는 %d원이 들어있습니다.\n",arr2[0]);
        System.out.printf("1번에는 %d원이 들어있습니다.\n",arr2[1]);
        System.out.printf("2번에는 %d원이 들어있습니다.\n",arr2[2]);
        System.out.printf("3번에는 %d원이 들어있습니다.\n",arr2[3]);
        System.out.printf("4번에는 %d원이 들어있습니다.\n",arr2[4]);
        System.out.printf("5번에는 %d원이 들어있습니다.\n",arr2[5]);
        System.out.printf("6번에는 %d원이 들어있습니다.\n",arr2[6]);
        System.out.printf("7번에는 %d원이 들어있습니다.\n",arr2[7]);*/

        for(int i = 0; i < 8; i++){
            System.out.printf("%d번에는 %d원이 들어있습니다.\n", i, arr2[i]);
        }



    }
}
