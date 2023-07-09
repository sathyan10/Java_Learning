package String;

import java.util.Scanner;

public class Alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char w=sc.nextLine().charAt(0);
        if(((w>=65)&&(w<=90))||(w>=97)&&(w<=122)){
            System.out.println(w+"\t is an alphabet");
        }else{
            System.out.println(w+"\t is not alphabet");
        }
    }
    
}
