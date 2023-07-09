import java.util.Scanner;

public class prime_number_identify_range {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start value");
        int n1=sc.nextInt();
        System.out.println("enter end value");
        int n2=sc.nextInt();
        for(int i=n1;i<n2;i++){
            int q,l=i;
            int c=1;
            if(i>1){
            q=i%2;
            if(q==0){
                if(i==2){
                System.out.println(i);
                }else{
                    c++;
                }
            
            }else{
                 if(q==1){
                for(int j=3;j<i;j++){
                    int t=0;
                    t=i%j;
                    if(t==0){
                        c++;
                    }
                }
                if((c==1)||(i==2)){
                    System.out.println(l);

                }
            }
                
                
            }
        }
        
        
    }
}

}


