package string.problems;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String word= "racecar";
        String word2="mom";
        String word3= "dad";
        String word4=" neila";

        System.out.println( word + " is a palindrome: " + isPalindrome(word));
        System.out.println( word2 + " is a palindrome: " + isPalindrome(word2));
        System.out.println( word3 + " is a palindrome: " + isPalindrome(word3));
        System.out.println( word4 + " is a palindrome: " + isPalindrome(word4));
        Palindrome palindrome=new Palindrome();






    }
    public static boolean isPalindrome(String word){
        char[]textArray=word.toLowerCase(Locale.ROOT).toCharArray();
        char[] reverseArray=new char[textArray.length];
        boolean flag= false;
        for(int i=textArray.length-1;i>=0;i--){
            reverseArray[textArray.length-1-i]=textArray[i];
        }
        for(int i=0;i<textArray.length;i++){
            if(textArray[i]== reverseArray[i]){
                flag=true;

            }else{
                flag=false;
            }

        }
        return flag;

    }
}


