package String;

import java.util.Scanner;

public class ToggleTheCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        for(int i=0;i<w.length();i++){
        if((w.charAt(i)>=97)&&(w.charAt(i)<=122)){
            System.out.println(Character.toUpperCase(w.charAt(i)));
        } else{
            System.out.println(Character.toLowerCase(w.charAt(i)));
        }

         }
        //  System.out.println(Character.toString(97));
        //  System.out.println(Character.toChars(97));
        //           System.out.println(Character.valueOf('a'));

    }

    
}
