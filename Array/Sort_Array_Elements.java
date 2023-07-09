package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1[]={7,2,4,9,3};
        Arrays.sort(n1);
        for(int i=0;i<n1.length;i++){
             System.out.println(n1[i]);
        }
        int s=sc.nextInt();
        int n[]=new int[s];
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(n[i]>n[j]){
                    int temp=0;
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
            }
        }
        for(int i=0;i<s;i++){
            System.out.println(n[i]);
        }
    }
    
}
