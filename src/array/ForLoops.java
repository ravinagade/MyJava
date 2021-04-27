package array;
import java.util.ArrayList;
import java.util.List;

public class ForLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("hii");
        }
        int i = 0;
        int arr[] = {1, 23, 44, 5, 5, 4, 4, 4};

        for (int j = 0; j < arr.length; ++j) {
            System.out.println(arr[j]);
        }
        for (int l = arr.length - 1; l > 0; l--) {
            System.out.println(arr[l]);
        }
        for (int k : arr) {
            System.out.println(k);
        }


    }
}
