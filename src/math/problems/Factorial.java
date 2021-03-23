package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        int n = 5;
        factorial(5);

        System.out.println("The result of Factorial of " + n + " is " +factorial(5) );
    }



        public static int factorial(int n) {
            // base case: if `n` is 0 or 1
            if (n < 1) {
                return 1;
            }

            return n * factorial(n - 1);
        }


    }














