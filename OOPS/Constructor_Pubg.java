package OOPS;

public class Constructor_Pubg {
    String s;
    int n;
    Constructor_Pubg(String name,int id){
        this.s=name;
        this.n=id;
    }
    void logIn(){
        System.out.println(this.s+" is sucessfully login");
    }void LogOut(){
        System.out.println(this.s+" is sucessfully logout");
    }void ChangeId(int k1){
        System.out.println(this.s+" is Succesfully Changed id");
    }
}
