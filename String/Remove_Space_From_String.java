package String;
import java.util.Scanner;

public class Remove_Space_From_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        // String t=w.replaceAll(" ", "");
        // System.out.println(t);
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(c!=' '){
                System.out.print(c);
            }
        }
    }
}
