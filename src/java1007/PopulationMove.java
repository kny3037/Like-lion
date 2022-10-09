package java1007;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido;
    private int toSido;
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap = new HashMap<>();


    //constructor 추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
//        this.setSidoMap();
    }

    public PopulationMove(String fromSido,String toSido){
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    private void setSidoMap(){


    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void parse(){

    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }
    //Method 설계란?
    //void readByChar(String filename) -> 이렇게 적어보는 것.
    //Method 이름은 그 기능이 어떤 기능을 하는 지 알 수 있도록 지어야 한다.
}
