package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        System.out.println(LongestWordLength(s) );
        ;


    }

    static int LongestWordLength(String str) {
        int n = str.length();
        int res = 0, curr_len = 0;
        for (int i = 0; i < n; i++) {
            // If current character is not
            // end of current word.
            if (str.charAt(i) != ' ')
                curr_len++;

                // If end of word is found
            else {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }
        }


        return Math.max(res, curr_len);
    }
}

