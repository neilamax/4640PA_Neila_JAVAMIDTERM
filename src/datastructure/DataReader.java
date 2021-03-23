package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class DataReader {

    public static void main(String[] args) {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
        FileReader fileReader=null;;
        BufferedReader bufferedReader=null;
        String data = "";
        try {
            fileReader = new FileReader(textFile);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 1; i < 50; i++) {
            list.add("...");
            list.add("good");

        }
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }



    }}