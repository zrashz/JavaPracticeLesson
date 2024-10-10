class CircularQueue {
    int[] arr;
    int front, rear, size, count;

    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        if (front == -1) front = 0;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % size;
        count--;
        if (isEmpty()) front = rear = -1; // Reset queue
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1; // Empty queue
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Front element: " + q.peek());
        q.dequeue();
        System.out.println("Front element after dequeue: " + q.peek());
    }
}

