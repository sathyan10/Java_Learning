import java.util.Scanner;

public class reverse_number {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,n1=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        System.out.println(n1+"\n\treversed\n"+s);
    }
    
}
