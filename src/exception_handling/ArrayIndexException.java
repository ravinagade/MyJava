package exception_handling;

public class ArrayIndexException {
    public static void main(String[] args){

        int arr[] = new int[6];

        arr[0] = 1;
        arr[1] = 13;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
