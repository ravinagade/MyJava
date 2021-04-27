package homework;
import java.util.Scanner;

public class TriangleNum {
    public static void main(String[] args){
        int i,j,row;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows");
        row=s.nextInt();
        System.out.println("our pattern");
        for(i=1; i<=row; i++){
            for(j=1; j<=i; j++){
            }
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

