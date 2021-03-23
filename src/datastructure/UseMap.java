package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        HashMap<Integer, String> countries  = new HashMap<>();
        countries.put(1, "Algeria");
        countries.put(2, "USA");
        countries.put(3, "France");
        countries.put(4, "Spain");
        System.out.println(countries);

        System.out.println(countries.get(1));

        countries.remove(2);
        System.out.println("after removing string at the  index 2 our new  map is: "+ countries);
        List<String> africa=new ArrayList<>();
        africa.add("Tunisia");
        africa.add("Morocco");
        africa.add("Egypt");

        Map<String, List <String>> m = new HashMap<>();
        m.put("Tunisia",africa);
        m.put("Morocco",africa);
        for(Map.Entry<String, List<String>> n: m.entrySet()){
            System.out.println(n.getKey() );
            System.out.println(n.getValue());}


        }}