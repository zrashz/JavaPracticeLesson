
// Stack implementation using Linked List
class StackUsingLinkedList {

    // Node class to represent each element in the stack
    private class Node {
        int data;
        Node next;
    }

    // Top of the stack
    private Node top = null;

    // Push operation to add an element to the stack
    public void push(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed onto the stack.");
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack underflow - the stack is empty.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the elements of the stack
    public void display() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Performing stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println(stack.pop() + " popped from the stack.");

        stack.display();
    }
}
