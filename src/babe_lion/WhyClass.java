package babe_lion;

public class WhyClass {
    // 클래스는 무엇인가?
    // 멤버 변수(id, address...)에 값을 저장하는 기능 + 동작을 내제화 시키는 기능
    // Method는 무엇인가?

    public static void main(String[] args) {

        /*
        id(Pk)
        address
        district
        category
        emergency_room
        name
        subdivision
        */
        // 굳이 클래스를 안쓰고 Array를 써도 되는 거 아닌가?
        String[] arr = new String[7];  //array는 타입이 지정되어 있다.
        arr[0]= "A1120837";
        arr[1]= "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        arr[2]= "서울특별시 금천구";
        arr[3]= "C";
        arr[4]= "2";
        // String만 들어가는 게 아니라 숫자와 날짜도 들어가는데(타입이 여러가지)
        // array는 다양한 타입을 소화할 수 없다.
        int emergencyRoom = Integer.parseInt(arr[4]);
        // 다른 타입은 이런 식으로 써줘야 한다.(클래스를 사용하면 빈번한 타입캐스팅을 안해도 됨.)

        // * 자바의 장점 (클래스를 쓰면서 이런 장점을 갖게 되는 것.)
        // Java는 강타입 언어. javascript는 약타입 언어
        // Java는 다른 타입으로 실행중에 바뀌지 않는다는 보장이 있다.
        // 변수를 통제하기가 좋다.

        // Class를 썼을 때의 이점.
        // array는 다양한 타입을 소화할 수 없다.
        // class를 쓰면 빈번한 타입 캐스팅을 안해도 됨.
        // 변수(오작동 하는 빈도)를 줄일 수 있다 - > 신뢰성이 다른 언어에 비해서 비교적 높다.
        // 이름을 가지고 접근 할 수 있다.
        // 동작(Method)을 class안에 내제화 시킬 수 있다.

        Hospital sp = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "서울특별시 금천구",
                "C",
                2,
                "365병원",
                null
        );

    }

}
