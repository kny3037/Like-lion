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
    public static void main(String[] args) {
        Squarstar squarstar = new Squarstar();
        squarstar.printSquareMatrix(4);
    }
}
