package math.problems;

import com.mongodb.DBCursor;

public class FindLowestDifference {


    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println(lowestDifference(array1,array2));

    }

    public static int lowestDifference(int[] array1, int[] array2) {
        int i;
        int j;
        int n = array1.length;
        int n1 = array2.length;


        int differance = array1[0] - array2[0];
        for (i = 1; i < n; i++) {
            for (j = 1; j < n1; j++) {
                int subst = array1[i] - array2[j];
                if (subst < differance) {
                    differance = subst;
                }
            }

        }
        return differance;
    }
}

