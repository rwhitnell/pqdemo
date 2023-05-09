package edu.guilford;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class PQDemo {
    public static void main(String[] args) {
        // Build a priority queue for random FullName objects
        // It will be sorted according to the natural ordering of FullName
        // as determined by the compareTo method and the sortOrder attribute

        // Whenever we instantiate a Collection (or Map), we should specify the class of objects
        // that can be stored in it. If we don't include that, it's equivalent to
        // PriorityQueue<Object>, which means that we could store any kind of object we want to.
        // You should specify the class of objects--that's making the generic type specific
        PriorityQueue<FullName> pq = new PriorityQueue<FullName>();
        // Add 20 FullName objects to the priority queue
        for (int i = 0; i < 20; i++) {
            pq.add(new FullName());
        }

        // Print the priority queue as it's stored
        System.out.println("The priority queue is:" + pq);

        // Now use poll to print out the priority queue in order
        System.out.println("The priority queue in order is:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Let's build a stack to show the difference
        // between a priority queue and a stack
        Stack<FullName> s = new Stack<FullName>();
        // Add 20 FullName objects to the stack
        for (int i = 0; i < 20; i++) {
            s.push(new FullName());
        }

        // Pop each element of the stack and print it
        System.out.println("The stack in order is:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println("Is the stack empty? " + s.isEmpty());
        System.out.println("Is the priority queue empty? " + pq.isEmpty());

                // Instantiate a TreeSet of FullName objects
        TreeSet<FullName> nameSet = new TreeSet<FullName>();

        // Add 20 FullName objects to the stack
        for (int i = 0; i < 20; i++) {
            s.push(new FullName());
        }
        System.out.println("Here's the new stack of FullName objects: ");
        System.out.println(s);

        // Add the elements of the stack to the TreeSet
        while (!s.isEmpty()) {
            // popping an element off the stack returns that element and removes it from the stack
            // then we add it to the set
            nameSet.add(s.pop());
        }

        // Print the TreeSet
        System.out.println("Here's the TreeSet of FullName objects: ");
        System.out.println(nameSet);
        System.out.println("The size of the set is " + nameSet.size());

        // Show that the Set is iterable
        System.out.println("Here's the TreeSet of FullName objects using for-each: ");
        for (FullName name : nameSet) {
            System.out.println(name);
        }
        // Is the set empty after iterating over it?
        System.out.println("Is the set empty? " + nameSet.isEmpty());
        // Sets and Lists have non-destructive iteration; Stacks and Queues have destructive iteration
        // Difference between destructive and non-destructive iteration is whether accessing the element
        // removes it from the data structure
 
        // Let's build a TreeMap of FullName objects using the last name as a key
        // By using TreeMap, we make the keys sorted and easily searchable
        TreeMap<String, FullName> map = new TreeMap<String, FullName>();

        // Add 20 FullName objects to the map
        for (int i = 0; i < 20; i++) {
            FullName name = new FullName();
            String key = name.getLastName();
            // If the key is already in the map, generate a new FullName object
            // Problem: we may lose objects that we want to be in the map
            // while (map.containsKey(key)) {
            //     name = new FullName();
            //     key = name.getLastName();
            // }
            // Solution: add a number to the key that is unique for the map
            if (map.containsKey(key)) {
                key = key + i;
            }
            // Issue: What if we want to add data later?
            // Another option: generate the key from additional data in the value

            map.put(key, name);
        }

        System.out.println("Here's the TreeMap of FullName objects: ");
        System.out.println(map);
        System.out.println("The size of the map is " + map.size());

        // Suppose that our values are a list of all FullName objects with the same last name
        TreeMap<String, ArrayList<FullName>> map2 = new TreeMap<String, ArrayList<FullName>>();
        // Each key is associated with a list of all FullName objects with that last name
        // Add 20 FullName objects to the map
        for (int i = 0; i < 20; i++) {
            FullName name = new FullName();
            String key = name.getLastName();    
            // if the key is not in the map, add <key, new ArrayList<FullName>()>
            // so we have some place to store the list of objects with the same last name
            if (!map2.containsKey(key)) {
                map2.put(key, new ArrayList<FullName>());
            }
            // add the object to the list associated with the key
            // get the ArrayList associated with the key
            ArrayList<FullName> list = map2.get(key);
            // add the current name to that list
            list.add(name);
        }

        System.out.println("Here's the TreeMap of lists of FullName objects: ");
        System.out.println(map2);
        System.out.println("The entry for the key Anderson is " + map2.get("Anderson"));
    }
}
