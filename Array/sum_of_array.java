package Array;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int n1[]=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            n1[i]=sc.nextInt();
            t+=n1[i];
        }
        System.out.println(t);
    }
    
}
