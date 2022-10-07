package java1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //constructor 추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능

    public PopulationMove(String fromSido,String toSido){
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void parse(){

    }



    //Method 설계
    //Method 설계란?
    //void readByChar(String filename) -> 이렇게 적어보는 것.
    //Method 이름은 그 기능이 어떤 기능을 하는 지 알 수 있도록 지어야 한다.
}
