package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000000];
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        // Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */


        //BubbleSort
        algo.bubbleSort(num);
        long  bubbleSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + bubbleSortExecutionTime + " milliseconds");
        //CombSort
        algo.bubbleSort(num);
        long  combSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + bubbleSortExecutionTime + " milliseconds");


        //quickSort

        algo.quickSort(num, 0, num.length - 1);
     long QuickSortExecutionTime = algo.executionTime;      System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + QuickSortExecutionTime + " milli sec");
      connectToSqlDB.insertDataFromArrayToSqlTable(num, "Quick_sort", "SortingNumbers");
       List<String> numbers6 = connectToSqlDB.readDataBase("Quick_sort", "SortingNumbers");
       System.out.println("Read Quick sort numbers from DataBase :");

       printValue(numbers6);
       System.out.println();

       randomize(num, n);



        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */
//Quicksort is one of the most efficient sorting algorithm. The first thing to do is to select a pivot number, this number will separate the data, on its left are the numbers smaller than it and the greater numbers on the right.
    }






    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
