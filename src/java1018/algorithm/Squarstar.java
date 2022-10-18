package java1018.algorithm;

public class Squarstar {
    void printSquareMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void printRectangle(int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Squarstar squarstar = new Squarstar();
        squarstar.printSquareMatrix(4);
        System.out.println();
        squarstar.printRectangle(3,5);
    }
}
