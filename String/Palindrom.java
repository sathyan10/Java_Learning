package String;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        String t="";
        for(int i=w.length()-1;i>=0;i--){
            t=t+w.charAt(i);
        }System.out.println(t);
        if(w.equals(t)){
            System.out.println("palindrom");
        }else{
        System.out.println("not palindrom");
        }
    }
    
}
