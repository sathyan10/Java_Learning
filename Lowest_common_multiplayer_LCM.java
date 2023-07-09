import java.util.Scanner;

public class Lowest_common_multiplayer_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m=n1>n2?n1:n2;
        int t=0;
        for(int i=m;i<n1*n2;i++){
            if((i%n1==0)&&(n2%i==0)){
                t=i;
            }
        }System.out.println(t);
    }
    
}
