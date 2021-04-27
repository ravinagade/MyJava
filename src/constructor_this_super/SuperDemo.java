package constructor_this_super;

public class SuperDemo {

    public static void main(String[] args){

        B b = new B(1);
    }
}
 class A{
    public A(){
        System.out.println("In a cont");
    }
    public A(int i){
        System.out.println("In parameter A");
    }
 }

 class B extends A{
    public B(){
        System.out.println("In B cont");
    }
    public B(int i){
        super(i);

        System.out.println("In parameter B");
    }
 }
