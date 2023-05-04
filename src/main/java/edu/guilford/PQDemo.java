package edu.guilford;

import java.util.PriorityQueue;
import java.util.Stack;

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


    }
}
