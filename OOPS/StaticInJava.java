package OOPS;

public class StaticInJava {
    public static void main(String[] args) {
        college c=new college("NGP");
        college c1=new college("PSG");
        college c2=new college("SNS");
        System.out.println(college.count);

      

    }
}
class college{
    String name;
    static int count=0;
    college(String s){
        this.name=s;
        count++;
    }
    
    
}
