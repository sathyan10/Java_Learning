import java.util.Scanner;

public class pow_of_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int t=1;
        for(int i=1;i<=p;i++){
            t=t*n;
        }
        System.out.println(t);
        System.out.println((int)Math.pow(n, p));
    }
    
}
