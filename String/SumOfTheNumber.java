package String;

import java.util.Scanner;

public class SumOfTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int s=0;
        for(int i=0;i<w.length();i++){
            char t=w.charAt(i);
            if((t>='0')&&(t<='9')){
                s=s+(w.charAt(i)-'0');
            }        }
            System.out.println(s);
    } 
    
}
