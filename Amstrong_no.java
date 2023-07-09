import java.util.Scanner;

public class Amstrong_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,r1,s=0,n1=n,sum=0;
        int n3=n;
        while(n>0){
            r=n%10;
            s++;
            n=n/10;
        } 
        while(n1>0){
            r1=n1%10;
            sum=sum+(int)Math.pow(r1, s);
            n1=n1/10;
        }
        if(sum==n3){
        System.out.println(sum+"\n"+"Amstrong number");
    }
    else{
        System.out.println("not Armstong"+"\n"+sum);
    }
    
}
}