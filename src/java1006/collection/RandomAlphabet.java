package java1006.collection;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {

        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();

        Set<Character> characters = new HashSet<>();

        for (int i = 0; i <50; i++){
           char alphabet = alphabetGenerator.generate();
            System.out.println(alphabet + " ");
            characters.add(alphabet);
        }

        System.out.println(characters);

    }
}
