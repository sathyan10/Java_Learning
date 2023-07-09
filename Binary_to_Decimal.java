import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,t=0,n1=n;
        while(n>0){
            int r=n%10;
            t=t+r*(int)Math.pow(2, c);
            n=n/10;
            c++;
        }
        System.out.println(t);
    }
    
}
