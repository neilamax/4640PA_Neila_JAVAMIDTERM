package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        int num=0;
        String name="";
        ArrayList<Integer> array1 = new ArrayList();
        ArrayList<String> array2=new ArrayList<>();

        Random r=new Random();
        while(num < 45 ){
            array1.add(r.nextInt(5));
            num++;
        }
        array1.remove(12);
        array1.add(3);
        array1.add(4);
        System.out.println("our 1st list is :" + array1);
        System.out.println("the size of our list is: " + array1.size());
        System.out.println("the num at index 4 is  : "+array1.get(4));
        System.out.println("***************");

        array2.add("Mouloud");
        array2.add("Neila");
        array2.add("Massyl");
        array2.add("Sarah");
        array2.add("Baby");
        System.out.println("our 2ed list is:  "+ array2);
        System.out.println("the size of our list is "+ array2.size());

        System.out.println("the name at index 4 is: "+ array2.get(4));


    }
}