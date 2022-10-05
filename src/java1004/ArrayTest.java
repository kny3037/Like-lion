package java1004;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");  //alt + shift + f10 눌러서 실행
        // 10칸의 int array를 만들고
        // 1부터 10까지 채워보기.
        // 그리고 console에 출력 해보기

        int[]arr;
        arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (i+1);
            System.out.println(arr[i]);
        }

    }
}
