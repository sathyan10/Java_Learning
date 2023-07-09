package Array;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int n1[]=new int[n];
        for(int i=0;i<n;i++){
            n1[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(n1[i]);

        }
    }
    
}
