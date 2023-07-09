import java.util.Scanner;

public class Fibonaci {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n3=0,n4=1,n2;
        System.out.println("0");
        System.out.println("1");
        for(int i=2;i<n;i++){
            n2=n3+n4;
            n3=n4;
            n4=n2;
            System.out.println(n2);
        }
    }
    
}
 