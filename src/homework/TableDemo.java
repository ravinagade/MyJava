package homework;
import java.util.Scanner;

public class TableDemo {

    public static void main(String[] args) {
        int n,c;
        System.out.print("Enter any number:");
        Scanner s = new Scanner(System.in);
         n=s.nextInt();
        System.out.println("result="+n);
        for(c=1; c<=10; c++) {
            System.out.println(n + "*" + c + "=" + (n * c));
        }
    }
}
