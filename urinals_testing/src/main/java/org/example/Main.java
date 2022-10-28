package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.regex.Pattern;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Main {
    public static List<String> inputLines=new ArrayList<>();
//    final static Pattern PATTERN = Pattern.compile("(.*?)(?:\\((\\d+)\\))?(\\.[^.]*)?");
    public static List<String> result=new ArrayList<>();
    public static void main(String[] args) {
        boolean func1=openFile();
        boolean func2=processString(inputLines);
        boolean func3=writeFile(result);
        if(func1 && func2 && func3){
            System.out.println("Result written in file");
        }

    }
    public static boolean processString(List<String> x){
        x = inputLines;
        int n= x.size();
        boolean flag=false;
        for(int i=0;i<n;i++){
            Integer answer=countUrinals(x.get(i));
            result.add(answer.toString());
            if(i==(n-1)) {
                flag = true;
            }
        }
        return flag;
    }
    public static boolean openFile(){
        boolean flag=false;
//        String FILE_PATH = "C:\\Users\\Harshi\\Documents\\SER 515\\ICA 8 testing final\\ICA-8-Testing-Harshitha-Karur\\urinals_testing\\src\\main\\java\\org\\example\\";
//        String FILE_PATH="https://github.com/harshithakarur/ICA-8-Testing-Harshitha-Karur/blob/552eecefa63688e3822e87efd4d0305db2dbb3ff/urinals_testing/src/main/java/org/example/myfile.dat";
        String FILE_PATH="src/main/java/org/example/";
        BufferedReader br = null;
        try {
            File file = new File(FILE_PATH+"myfile.dat"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader
            String line;
            while ((line = br.readLine()) != null) {
                // process the line
                inputLines.add(line);
            }
            flag=true;
        }
        catch(IOException e) { e.printStackTrace();}
        finally
        {
            try { if (br != null) br.close(); }
            catch(IOException e) { e.printStackTrace(); }
        }

        return flag;

    }

    public static boolean writeFile(List<String> x){
        boolean flag=false;
        try {
            File myObj = new File("rule.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter("rule.txt");
//                int n=result.size();
                for (String value : result) {
                    String s = value + "\n";
                    myWriter.write(s);
                }
                myWriter.close();
                flag=true;
                return flag;


            } else {
                System.out.println("File already exists.");
                return flag;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return flag;
        }
    }



    public static Integer countUrinals(String s){
        boolean flag=false;
//        String s="1001";
        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
//            System.out.println(flag);
//            System.out.println(count);
            if(s.charAt(i)=='1' && flag){
//                System.out.println("return -1");
                return -1;
            }
            else if(s.charAt(i)=='1'){
                flag=true;
            }
            else if(s.charAt(i)=='0' && !flag){
                if(i+1<n){
                    if(s.charAt(i+1)=='0'){
                        count++;
                        flag=true;
                    }
                }
                else{
                    count++;
                    flag=true;
                }
            }
            else{
                flag=false;
            }
        }
//        System.out.println("Count:"+count);
//        Integer answer=count;
        return count;

    }
}