import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
        if((n==0)&&(n==1)){
            System.out.println(1);
        }
        for(int i=1;i<=n;i++){
                t=t*i;
            }
        System.out.println(t);
    }
    
}
 
    

