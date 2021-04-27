package homework;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args){
        int num,b=1,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        num=s.nextInt();
        while(b<=num){
            if((num%b)==0)
                c=c+1;
            b++;

        }
        if(c==2)
            System.out.println("It is a prime number"+num);
        else
            System.out.println("It is not a prime number"+num);
    }
}
