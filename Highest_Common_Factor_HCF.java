import java.util.Scanner;

public class Highest_Common_Factor_HCF {
    //this also GcD
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int t=0;
        System.out.println();
        for(int i=1;i<n1||i<n2;i++){
            if((n1%i==0)&&(n2%i==0)){
                t=i;
            }
        }
        System.out.println(t);
    }
    
}
