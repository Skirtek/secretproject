package com.codecool.apple.common;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // LIFO (Stack)
        Deque<Integer> lifoQueue = new ArrayDeque<>();
        lifoQueue.push(1);
        lifoQueue.push(2);
        lifoQueue.push(3);

        while (!lifoQueue.isEmpty()) {
            System.out.println(lifoQueue.pop()); // Prints 3, 2, 1
        }

        // FIFO (Queue)
        Queue<Integer> fifoQueue = new LinkedList<>();
        fifoQueue.offer(1);
        fifoQueue.offer(2);
        fifoQueue.offer(3);

        while (!fifoQueue.isEmpty()) {
            System.out.println(fifoQueue.poll()); // Prints 1, 2, 3
        }
    }
}

