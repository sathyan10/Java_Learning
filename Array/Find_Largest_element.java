package Array;

import java.util.Scanner;

public class Find_Largest_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=0;
        int n[]=new int[s];
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            if(t<n[i]){
                t=n[i];
            }
        }System.out.println(t);
    }
    
}
