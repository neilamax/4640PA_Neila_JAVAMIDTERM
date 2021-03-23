
package datastructure;

import java.util.*;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> queue = new LinkedList<>();
        queue.add("Amel");
        queue.add("Maxen");
        queue.add("hmeza");
        System.out.println(queue);
        queue.poll();

        Iterator n = queue.iterator() ;
        while(n.hasNext()){
            System.out.println(n.next());
        }

        System.out.println(queue.remove("hmeza"));
        System.out.println(queue);
    }
}
