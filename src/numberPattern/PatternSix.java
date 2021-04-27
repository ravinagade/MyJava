package numberPattern;

public class PatternSix {
    public static void main(String[] args){
        int count=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++, count++)
                System.out.print(count+ " ");
            System.out.println();
        }
    }
}
