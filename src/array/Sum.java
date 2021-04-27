package array;

public class Sum {
    public static void main(String[] args){
        int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        Double average;

        for(int number:numbers) {
            sum += number;
        }
        int arrayLength= numbers.length;
        average= ((double)sum/(double)arrayLength);

        System.out.println("sum=" +sum);
        System.out.println("Average=" +average);

        }
    }

