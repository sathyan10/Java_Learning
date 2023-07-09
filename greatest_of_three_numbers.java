import java.util.Scanner;
public class greatest_of_three_numbers  {
                public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter value1");
                int n=sc.nextInt();
                System.out.println("enter value2");
                int n1=sc.nextInt();
                System.out.println("enter value3");
                int n2=sc.nextInt();
                if((n1>n)&&(n1>n2)){ 
                    System.out.println(n2);
                }
                   if((n>n1)&&(n>n2)){
                        System.out.println(n);   
                    }
                 if((n2>n1)&&(n2>n)){
                    System.out.println(n2);
                }
        
            }
            
        }
        
