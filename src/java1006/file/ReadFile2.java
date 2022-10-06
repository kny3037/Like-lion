package java1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile2 {
    public static void main(String[] args) throws IOException{

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
/*
실행 결과
.\.git
.\.gitignore
.\.idea
.\a_file.txt
.\java-project-push-exercise.iml
.\out
.\src
* */