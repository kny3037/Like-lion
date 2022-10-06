package java1006.collection;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCnt {

    public static boolean isAlphabet(char c){
        if((c >= 65 && c< 90) || (c >= 97 && c< 122)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String repoAddr = "aaaabbbccddeffghijjkkllmm";
        int count = 0;

        for (int i = 0; i < repoAddr.length(); i++){
            char c = repoAddr.charAt(i);
            if (isAlphabet(c)){
                count++;
            }

        }








       /* HashMap<String, Integer> alphabetCnt = new HashMap<>();
        alphabetCnt.put("a", 2);*/

        //알파벳 별 개수 출력
        //Hint
        //알파벳인지 판단은 어떻게 할까?
        //1. 위 ascii code표에  대문자 65 ~ 90, 소문자 97~122 if((c >= 65 and c< 90) or ())
        //2. arr만 써서 하는 방법



    }
}
