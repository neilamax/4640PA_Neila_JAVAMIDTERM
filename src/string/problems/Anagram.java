package string.problems;

import com.mysql.cj.jdbc.exceptions.PacketTooBigException;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"


    */
    public static void main(String[] args) {
        System.out.println(isAnagram("cat","act"));
    }
    public static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }

        char[] chars = word.toCharArray();

        for(char c : chars){
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }
        }

        return anagram.isEmpty();
    }


}

