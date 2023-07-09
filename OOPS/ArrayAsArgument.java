package OOPS;

public class ArrayAsArgument {
    public static void main(String[] args) {
        name N=new name("Sathyan");
        p hi=new P();
        hi.p(N);
        
    }
    
    
}
class name{
    String Name;
    name(String Name){
    this.Name=Name;
    }
}
class p{
    void p(name print){
    System.out.println("Hi "+print.Name);
    }
}

