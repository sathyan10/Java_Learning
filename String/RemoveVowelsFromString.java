package String;

import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int c=0;
       for(int i=0;i<w.length();i++){  
                if((w.charAt(i)=='a')||(w.charAt(i)=='e')||(w.charAt(i)=='i')||(w.charAt(i)=='o')||(w.charAt(i)=='u')||(w.charAt(i)=='a')
                ||(w.charAt(i)=='A')||(w.charAt(i)=='E')||(w.charAt(i)=='I')||(w.charAt(i)=='O')||(w.charAt(i)=='U')){
                   
                }else{
                System.out.println(w.charAt(i));
                }
       }
    //    String k=w.replaceAll("[aeiouAEIOU]","");
    //    System.out.println(k);
       
    }
    
}
