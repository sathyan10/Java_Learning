import java.util.Scanner;

public class prime_factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n*2,m=0,c=1;
        while(n1>0){
            n1=n1/2;
            m=n1%2;
            if(m==0){
                System.out.println(2);
            }else{
                System.out.println(n1);
                break;
            }

        }
    }
    
}
