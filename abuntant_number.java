import java.util.Scanner;

public class abuntant_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++){
            int n3=0;
            n3=n%i;
            if(n3==0){
                s=s+i;
            }
           
        }
        if(s>n){
            System.out.println(n+"Abountant number "+s);
        }
        
    }
    
    
}


