package String;
import java.util.Scanner;

public class vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char w=sc.nextLine().charAt(0);
        if((w=='a')||(w=='e')||(w=='i')||(w=='o')||(w=='u')
        ||(w=='A')||(w=='E')||(w=='I')||(w=='O')||(w=='U')){
            System.out.println(w+"\tis a vowel");
        }else{
            System.out.println(w+"\tis a cosonant");
        }

    }
    
}
