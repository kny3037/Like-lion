import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;

        System.out.print("금액을 입력하세요.");
        money = sc.nextInt();

        int m1 = money/50000;
        System.out.println("50000원" + m1 +"개");
        int m2 = (money%50000)/10000;
        System.out.println("10000원" + m2 + "개");
        int m3 = (money%10000)/5000;
        System.out.println("5000원" + m3 + "개");
        int m4 = (money%5000)/1000;
        System.out.println("1000원" + m4 + "개");
        int m5 = (money%1000)/500;
        System.out.println("500원" + m5 + "개");
        int m6 = (money%500)/100;
        System.out.println("100원" + m6 + "개");
        int m7 = (money%100)/50;
        System.out.println("50원" + m7+ "개");
        int m8 = (money%50)/10;
        System.out.println("10원" + m8 + "개");

    }
}
