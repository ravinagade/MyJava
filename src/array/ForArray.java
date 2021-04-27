package array;

public class ForArray {

    public static void main(String[] args){
        int[] myintarray= {1, 2, 3, 4, 5};
        /*for(int index=0; index<5; index++){
            System.out.println(myintarray[index]);
        }*/
        for(int element : myintarray){
            System.out.println(element);
        }
    }
}
