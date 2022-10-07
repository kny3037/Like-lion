package java1007;

import java.util.List;
//List<T>를 리턴하는 인터페이스 설계
public interface DoSomething<T> {
    List<T> work(String str);


}
