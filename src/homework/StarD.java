package homework;

public class StarD {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i >= 2 && j >= 2 && i <=3 && j <=5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
