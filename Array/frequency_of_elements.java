package Array;

import java.util.Scanner;

public class frequency_of_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n[]=new int[s];
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            int c=1;
            int f=0;
            for(int j=0;j<s;j++){
                if(j>=i){
                if((n[i]==n[j])&&(i!=j)){
                    c++;
                }
            }else if(n[i]==n[j]){
                    f=1;
                }
            }
        if(f==0)
             System.out.println(n[i]+" Count "+c);
            
        }
    }
    
}
