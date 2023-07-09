import java.util.Scanner;

public class Strong_number {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,n1=n,t=0;
        while(n>0){
            r=n%10;
            int s=1;
            for(int i=1;i<=r;i++){
                s=s*i;
            }
            t=t+s;
            n=n/10;
        }
        if(n1==t)
        System.out.println("Strong number"+"\t"+t);
        else
        System.out.println("not Strong"+"\t"+t);
    }
    
}


