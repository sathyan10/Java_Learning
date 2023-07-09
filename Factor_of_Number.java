import java.util.Scanner;

public class Factor_of_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int n3=0;
            n3=n%i;
            if(n3==0){
                System.out.println(i);
            }
        }
        
    }
    
    
}

