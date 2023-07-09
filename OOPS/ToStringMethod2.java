package OOPS;

public class ToStringMethod2 {
    String name;
    String city;
    String country;
    int year;
    ToStringMethod2(String n,String c,String co,int y){
        this.name=n;
        this.city=c;
        this.country=co;
        this.year=y;
        //System.out.println(n+" "+c+" "+co+" "+y);
    }
   public String toString(){
        return name+" "+city+" "+country+" "+year;
    }
    
}
