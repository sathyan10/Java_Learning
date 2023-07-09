package IntermediateConcept;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b1=sc.nextInt();
        Boolean b=true;
        Integer i=b1;
        Character c='#';
        Float f=1.3f;
        System.out.println("\t AUTOBOXING");
        System.out.println(b);
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
        System.out.println("\t UNBOXING");
        System.out.println(b==true);
        System.out.println(i++);
        System.out.println(c);
        System.out.println(f);

        /* */
        System.out.println(i.compareTo(10));
        System.out.println(f.intValue());

        
    }
    
}
