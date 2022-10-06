package java1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김나영");
        this.students.add("김유리");
        this.students.add("아라");
        this.students.add("김소영");
    }

    public List<String> getStudents(){
        return this.students;
    }
}
