package String;
import java.util.Scanner;

public class RemoveBracketsFromAlgebricExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        for(int i=0;i<w.length();i++){
            char t=w.charAt(i);
            if((t=='{')||(t=='}')||(t=='(')||(t==')')||(t=='[')||(t==']')){

            }else{
                System.out.print(t);
            }
        }

    }
    
}
