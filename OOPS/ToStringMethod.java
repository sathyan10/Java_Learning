package OOPS;

public class ToStringMethod {
    public static void main(String[] args) {
        ToStringMethod2 ts=new ToStringMethod2("sathyan","CBE","IND",2023);
        ToStringMethod2 t=new ToStringMethod2("M","CBE","IND",2023);

        System.out.println(ts);//implicit
        System.out.println(t.toString());//explicit
    }
    
}
