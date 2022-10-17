package java1017.algorithm;
// 직각삼각형 - * 개수에만 신경쓰면 된다.
// 피라미드 - *의 위치도 신경 써야 한다.
public class Pyramid {

    public void printStar(int n){
        for (int i = 0; i < n; i++) {
            //공백 출력
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printStar(5);
    }
}
