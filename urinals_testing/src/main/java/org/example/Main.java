package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> result=new ArrayList<>();
        List<String> inputLines=new ArrayList<>();
        boolean func1=openFile(inputLines);
        boolean func2=processString(inputLines,result);
        boolean func3=writeFile(result);
        if(func1 && func2 && func3){
            System.out.println("Result written in file");
        }

    }
    public static boolean processString(List<String> inputLines,List<String> result){
        int n= inputLines.size();
        boolean flag=false;
        for(int i=0;i<n;i++){
            Integer answer=countUrinals(inputLines.get(i));
            result.add(answer.toString());
            if(i==(n-1)) {
                flag = true;
            }
        }
        return flag;
    }
    public static boolean openFile(List<String> inputLines){
        boolean flag=false;
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

    public static boolean writeFile(List<String> result){
        boolean flag=false;
        try {
            int num = 0;
            String save = "rule";
            String fileName=save+".txt";
            String myDir="C:\\Users\\Harshi\\Documents\\SER 515\\ICA 8 testing final\\ICA-8-Testing-Harshitha-Karur\\urinals_testing";
            File file = new File(myDir, fileName);
            while(file.exists()) {
                fileName = save + (++num) +".txt";
                file = new File(myDir, fileName);
            }
                FileWriter myWriter = new FileWriter(fileName);
                for (String value : result) {
                    String s = value + "\n";
                    myWriter.write(s);
                }
                myWriter.close();
                flag=true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return flag;
    }



    public static Integer countUrinals(String s){
        boolean flag=false;
//        String s="1001";
        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1' && flag){
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
        return count;

    }
}