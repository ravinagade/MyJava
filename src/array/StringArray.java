package array;

import java.util.Locale;

public class StringArray {

    public static void main(String[] args){
     String myString = "Hello World";

     /*For finding length*/
     int myStringLength = myString.length();

    /*For lower case*/
     String myStringLowerCase = myString.toLowerCase();

     /*For upper case*/
     String myStringUpperCase = myString.toUpperCase();

     /* For replacing character*/
     System.out.println(myString.replace('e','a'));
    }
}
