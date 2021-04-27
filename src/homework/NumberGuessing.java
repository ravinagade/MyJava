package homework;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args){

        int number;
        int guess;
        int trials=0;

        Scanner scanner = new Scanner(System.in);
        number = (int) (Math.random() *100+1);

        do{
            System.out.println("Enter the number");
            guess = scanner.nextInt();
            trials++;
            if(guess > number){
                System.out.println("Number is HIgh");
            }else if(guess < number){
                System.out.println("Number is Low");
            }else{
                System.out.println("You guess correct in trials" +trials);
            }
        }while(guess != number);

    }
}
