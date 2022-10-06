package java1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileT {

    public void File(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException{  // 한 글자 읽기
        FileReader fileReader = new FileReader(filename);

        return (char)fileReader.read();
    }

    public String read2Char(String filename) throws IOException{  // 두 글자 읽기
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();

        return str;
    }

    public static void main(String[] args) throws IOException{

        ReadFileT readFileT = new ReadFileT();
        char c = readFileT.readAChar("a_file.txt");
        //한 글자 읽기
        String str = readFileT.read2Char("a_file.txt");
        //두 글자 읽기
        System.out.println(c);
        System.out.println(str);

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