package Day9;
public class Stack {
    private int[] arr;
    private int top;

    public Stack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow: Cannot push element " + element + ", stack is full.");
            return;
        }
        arr[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());

        stack.push(40);
        stack.push(50);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
