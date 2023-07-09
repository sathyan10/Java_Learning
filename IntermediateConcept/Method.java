package IntermediateConcept;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int k=sc.nextInt();
        String s=sc.next();
        all(c,k,s);
    }
    static String details(String S){
        return "name : "+S;
        
    }
    static char oo(char j){
            return j;
    }
    static void all(char  c,int a,String s){
        System.out.println(c);
        System.out.println(a);
        System.out.println(s);
    }
}
