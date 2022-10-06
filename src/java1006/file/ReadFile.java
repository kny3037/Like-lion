package java1006.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

  //    char readOneByte(String filename)
  //  지정한 파일의 맨 앞 한byte를 읽어오는 method를 만들어보세요

    private String filename;

    public ReadFile(String filename){
        this.filename = filename;
    }

    char readByte() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.FileReader(this.filename));
        return (char)br.read();
    }

    boolean FileExists(){
        return Files.exists(Paths.get(this.filename));
    }

    public static void main(String[] args) throws IOException{

        ReadFile readFile = new ReadFile("./a_file.txt");
        if (readFile.FileExists()){
            char a = readFile.readByte();
            System.out.println(a);

        }

    }
}
