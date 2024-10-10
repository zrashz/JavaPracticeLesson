class StackNode { // Renamed to StackNode to avoid conflict
    int data;
    StackNode next;
}

class Stack {
    StackNode top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        StackNode newNode = new StackNode(); // Using renamed StackNode
        newNode.data = value;
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        top = top.next;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        }
        return -1; // Empty stack
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
    }
}
