package java1011;

import java.util.Scanner;

public class SumOfDigit {
    public int solution(int n){
        int answer = 0;

        while(n > 0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SumOfDigit sod = new SumOfDigit();

        int num = sc.nextInt();

        System.out.println(sod.solution(num));
    }
}
