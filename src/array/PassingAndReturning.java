package array;

public class PassingAndReturning {

    public static void main(String[] args){

        /*Passing*/
      sayHello("John");
      sayHello("Tom");
      sayHello("Mark");
    }
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

}
