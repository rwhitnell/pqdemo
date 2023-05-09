package edu.guilford;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class PQDemo {
    public static void main(String[] args) {
        // Build a priority queue for random FullName objects
        // It will be sorted according to the natural ordering of FullName
        // as determined by the compareTo method and the sortOrder attribute

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
 

    }
}
