import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        if((n%2==1)&&(n!=1)){
            for(int i=3;i<n;i++){
                int n3=0;
                n3=n1%i;
                if(n3==0){
                    System.out.println("not prime number");
                break;
                }
            }
            
        }if(n%2==0){
            System.out.println("not prime");
        }
        else
        System.out.println("prime");
    }
    
    
}
