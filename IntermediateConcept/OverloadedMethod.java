package IntermediateConcept;

import java.util.Scanner;

public class OverloadedMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int k=sc.nextInt();
        int o=sc.nextInt();
        int i=sc.nextInt();
        Q(s,k);
        Q(s,k,o,i);
    }
    static void Q(int a,int b){
    System.out.println(a+b+"\t1");
    }
    static void Q(int a,int b, int c){
        System.out.println(a+b+c+"\t2");
        
    }
    static void Q(int a,int b,int c,int d){
        System.out.println(a+b+c+d+"\t3");
    }
    static void Q(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e+"\t4");
        
    }
    
}
