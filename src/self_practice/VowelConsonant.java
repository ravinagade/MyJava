package self_practice;

import javax.swing.*;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args){

        boolean isVowel = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = s.next().charAt(0);
        switch(ch){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                isVowel = true;
        }
        if(isVowel == true){
            System.out.println(ch+" is a Vowel");
        }
        else{
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" is a Consonant");
            else
                System.out.println("Input is not an Alphabet");
        }

    }
}
