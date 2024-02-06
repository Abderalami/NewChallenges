package Day9;

import java.util.ArrayList;
import java.util.List;

 class ArrayListQueue {
    private List<Integer> queue;

    // Constructor to initialize the queue
    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    // Enqueue: Add an element to the back of the queue
    public void enqueue(int element) {
        queue.add(element);
    }

    // Dequeue: Remove the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    // Peek: Get the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // For demonstration purposes
    public static void main(String[] args) {
        ArrayListQueue queue = new ArrayListQueue();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Peek the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}

