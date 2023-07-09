import java.util.Scanner;

public class palidrom_number {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,n1=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(s==n1){
            System.out.println("pallindrom"+"\t"+s);
        }else
        System.out.println("not palindrom"+"\n"+s);
    }
    
}


