package Array;
import java.util.Scanner;

public class Find_second$mallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=0,t1=0;
        int n[]=new int[s];
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
            t=n[0];
            t1=n[1];
        }
        for(int i=0;i<s;i++){
            if(t>n[i]){
                t1=t;
                t=n[i];
            }else if((t1>n[i])&&(t!=n[i])){
                t1=n[i];
            }
        }
    System.out.println(t1);

   }
}
    

