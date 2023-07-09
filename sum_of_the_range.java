import java.util.Scanner;
public class sum_of_the_range {
                public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter from value");
                int n=sc.nextInt();
                System.out.println("enter to value");
                int n1=sc.nextInt();
                int sum=0;
                for(int i=n;i<=n1;i++){
                    sum=sum+i;
                }
                System.out.println("sum of value is"+" "+sum);
        
            }
            
        }
        