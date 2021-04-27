package self_practice;

import java.util.Scanner;

public class SumScanner {

    public static void main(String[] args){

        int a,b,sum;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a= s.nextInt();

        System.out.println("Enter second number");
        b= s.nextInt();

        sum= a+b;
        System.out.println("Sum of these numbers: "+sum);
    }
}
