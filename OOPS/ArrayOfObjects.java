package OOPS;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        ArraysOfObjects1[] oa=new ArraysOfObjects1[5];
        Scanner sc=new Scanner(System.in);
        ArraysOfObjects1 ob=new ArraysOfObjects1("sathyan", "10-Oct-2001", "CBE", 22);
        ArraysOfObjects1 ob1=new ArraysOfObjects1("Manoj", "14-Feb-2006", "CBE", 18);
        oa[0]=ob;
        oa[1]=ob1;
        System.out.println(oa[0].name);
        System.out.println(oa[0].dob);
        System.out.println(oa[0].age);
        System.out.println(oa[0].city+"\n");
        System.out.println(oa[1].name);
        System.out.println(oa[1].dob);
        System.out.println(oa[1].age);
        System.out.println(oa[1].city);
    }
    
}
