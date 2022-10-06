package java1006.collection;

public class AlphabetGenerator implements GenerateAlphabet {
    @Override
    public char generate(){
        return (char)((int)(Math.random()*26)+65) ;
    }
}
