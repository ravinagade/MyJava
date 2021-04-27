package homework;
import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args){
    int n,c,f=1;
    System.out.println("Enter any number");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    if(n<0){
        System.out.println("Number should be non-negative");
    }
    else{
        for(c=1; c<=n; c++)
            f= f*c;
        System.out.println("Factorial of "+n+" is=" +f);
    }
    }


}
