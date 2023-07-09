package IntermediateConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList();
        ArrayList<String> Mark=new ArrayList();
        ArrayList<String> result=new ArrayList();
            names.add("Sathyan");
            Mark.add("100");
            result.add("P");
            names.add("Manoj");
            Mark.add("30");
            result.add("F");
            names.add("Gokul");
            Mark.add("45");
            result.add("P");
            names.add("Jokey");
            Mark.add("0");
            result.add("F");
        System.out.println(names);
        System.out.println(Mark);
        System.out.println(result);
        System.out.println("2D ARRAYLIST");
        ArrayList<ArrayList<String>> t=new ArrayList<>();
        t.add(names);
        t.add(Mark);
        t.add(result);
        System.out.println(t);
        System.out.println(t.get(0).get(0));
        System.out.println();
        
    }
    
}
