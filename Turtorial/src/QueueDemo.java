
class Queue {
    int[] arr;
    int front, rear, size;

    public Queue(int size) {
        arr = new int[size];
        front = rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = value;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
        if (front > rear) front = rear = -1; // reset queue
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1; // Empty queue
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Front element: " + q.peek());
        q.dequeue();
        System.out.println("Front element after dequeue: " + q.peek());
    }
}
