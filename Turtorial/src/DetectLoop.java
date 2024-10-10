
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public boolean hasLoop() {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
}

public class DetectLoop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(20);
        list.push(15);
        list.push(10);
        list.head.next.next.next = list.head; // Creating a loop

        if (list.hasLoop()) {
            System.out.println("Loop detected in the linked list");
        } else {
            System.out.println("No loop in the linked list");
        }
    }
}
