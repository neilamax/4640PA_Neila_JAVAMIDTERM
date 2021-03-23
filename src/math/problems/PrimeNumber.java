package math.problems;

public class PrimeNumber {
    public static void primeNum() {
        int i = 0;
        int num = 0;
        String primeNum = "";

        for (i = 2; i <= 1000000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNum = primeNum + i + " ";
            }
        }
        System.out.println(" the Prime numbers from 2 to 1000000 are :");
        System.out.println(primeNum);
    }


    public static void main(String[] args) {
        primeNum();
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

    }


}
