package org.example;

public class Main {
    public static void main(String[] args) {

        
    }
    public static int countUrinals(String s){
        boolean flag=false;
//        String s="1001";
        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            System.out.println(flag);
            System.out.println(count);
            if(s.charAt(i)=='1' && flag==true){
//                System.out.println("return -1");
                return -1;
            }
            else if(s.charAt(i)=='1'){
                flag=true;
            }
            else if(s.charAt(i)=='0' && flag==false){
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
        return count;

    }
}