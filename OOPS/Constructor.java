package OOPS;

import java.util.Scanner;


public class Constructor {
    public static void main(String[] args) {
        System.out.println("Welcome To Pubg Login"+"\n*********************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Nmae");
        String name=sc.nextLine();
        System.out.println("Enter Your Id");
        int id=sc.nextInt();
        System.out.println("Select Service");
        System.out.println("1.LogIn"+"\n"+"2.LogOut"+"\n"+"3.ChangeId"+"\n");
        int i=sc.nextInt();
        Constructor_Pubg p=new Constructor_Pubg(name,id);
        if(i==1){
            p.logIn();
        }else if(i==2){
            p.LogOut();
        }else if(i==3){
            System.out.println("Enter Old id:");
            int k=sc.nextInt();
            if(id==k){
                System.out.println("Enter New id:");
                int k1=sc.nextInt();
                p.ChangeId(k1);
            }else{
                System.out.println("Enter Valid id");
            }
            
        }else{
            System.out.println("Please Enter Valid Service");
        }
        

    }
    
}
