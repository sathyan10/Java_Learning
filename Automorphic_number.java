import java.util.Scanner;

public class Automorphic_number {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,n1=n*n;
            r=n1%10;
            if(r==n){
            System.out.println(n+"\n\tAutomorphic number\n"+r);
        }else
        System.out.println("Not Automorphic"+"\t"+r);
        
    }
    
}

    

