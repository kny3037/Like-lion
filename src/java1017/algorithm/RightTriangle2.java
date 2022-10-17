package java1017.algorithm;

public class RightTriangle2 {

    private String letter = "*";
    // * 뿐 만이 아니라 #,@도 가능하게끔.
    public RightTriangle2(String letter) {
        this.letter = letter;
    }

    public void printStar(int n){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle2 r = new RightTriangle2("@");
        r.printStar(5);
    }
}
