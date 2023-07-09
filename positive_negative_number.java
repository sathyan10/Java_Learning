import java.util.Scanner;
public class positive_negative_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("positive number"+" "+n);
        }else{
            System.out.println("Negative number"+" "+n);
        }

    }
    
}
