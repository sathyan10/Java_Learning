package String;

import java.util.Scanner;

public class StringLengthWithoutShortCut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        //int n=w.length();
        int t=0;
        for(int i: w.toCharArray()){
            t++;
        }
        System.out.println(t);
    }
    
}
