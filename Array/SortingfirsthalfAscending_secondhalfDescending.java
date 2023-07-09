package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingfirsthalfAscending_secondhalfDescending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int []n=new int[s];
        int t[]=new int[s];
        int t1=0;
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
            t1=n[s-1];
        }for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]>n[j]){
                    int temp=0;
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
                

            }
            
        }
        for(int i=0;i<s/2;i++){
            System.out.println(n[i]);
        }for(int i=s-1;i>=s/2;i--){
            System.out.println(n[i]);
        }
    }
}
