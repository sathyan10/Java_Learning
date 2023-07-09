import java.util.Scanner;

public class Armstrong_within_range{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
       
    for(int i=n;i<n1;i++){
        int r,r1,s=0,sum=0;
        int n2=0,t=0;
        n2=i;
        t=i;
        while(n2>0){
            r=n2%10;
            s++;
            n2=n2/10;
        } 
        while(t>0){
            r1=t%10;
            sum=sum+(int)Math.pow(r1, s);
            t=t/10;
        }
        if(sum==i){
        System.out.println(sum);
    }
}
    
}
}

