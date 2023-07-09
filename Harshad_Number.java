import java.util.Scanner;

public class Harshad_Number {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,n1=n,t=0;
        while(n1>0){
            r=n1%10;
            s=s+r;
            n1=n1/10;
        }
        t=n%s;
        if(t==0){
            System.out.println(n+"\n\tHarsad Number\n"+s);
        }else
        System.out.println(n+"Not Harshad number"+s);
        
    }
    
}
/*
 * Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6
 */
    
