package java1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PopulationStatistics {
    //코드 메소드로 분리
    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        // 파일을 읽지 않는다.

        String fileContents="";
        while (fileContents.length() <1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String filename) throws IOException{

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
           // System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    public void readAllLine(String filename)throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item ->{
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm : pms){
            System.out.println(pm.getFromSido());
        }
    }

    public PopulationMove parse(String data){
        //String data = 50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528
        //csv
        String[] splittedLine = data.split(",");
        //.split() --> String[]
        return new PopulationMove(splittedLine[0],splittedLine[1]);  //from to -> 파싱 로직 변경
    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null);{
                System.out.println(line);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    // List<String>을 지정한 파일에 write
    // List<String>을 받아서 filename에 쓴다.
    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs){
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

  /*  public Set<Integer> printSidoCd(List<PopulationMove> populationMoves){

        Set<Integer> intSet = new HashSet<>();
        //for(PopulationMove pm : p)
    }*/

    public Map<String, Integer> getMoveCntMap(List<PopulationMove>pml){
        Map<String,Integer>moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSidoKorean() + "," + pm.getToSido();
            if(moveCntMap.get(key)==null){
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key, moveCntMap.get(key)+1);
        }
        return moveCntMap;
    }


    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

 //       List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml){
            System.out.printf("전입 : %s , 전출 : %s\n",pm.getFromSido(),pm.getToSido());
 //           String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
        }
  //      System.out.println(pml.size());
 //       populationStatistics.createAFile("./from_to.txt");
 //       strings.add("11,11");

//        System.out.println(strings.size());

//        populationStatistics.write(strings,"./from_to.txt");

        Set<Integer> sidoCodes = new HashSet<>();
        for (PopulationMove pm : pml) {
            sidoCodes.add(pm.getFromSido());
            sidoCodes.add(pm.getToSido());
        }
       // System.out.println(sidoCodes);


        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);
        for (String key : map.keySet()){
            System.out.println(key + map.get(key));
        }


    }
}
