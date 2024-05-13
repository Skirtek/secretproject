package com.codecool.apple.common;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.offer(4);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(2);

        // Removing elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Prints 1, 2, 3, 4 (in ascending order)
        }
    }
}

