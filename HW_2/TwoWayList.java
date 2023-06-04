package HW_2;

public class TwoWayList<E> {
    private static Node head;
    private static Node tail;
    private int size;

    public int size() {
        return this.size;
    }

    public void add(int value) {
        Node newNode = new Node<>();
        newNode.value = value;
        if (head != null) {
            head.prevNode = newNode;
            newNode.nextNode = head;
        }
        if (size == 1)
            tail = head;
        head = newNode;
        size++;
    }

    public static void print() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " -> ");
            ptr = ptr.nextNode;
        }
        System.out.println("null");
    }

    public static void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.nextNode;
            Node prev = currentNode.prevNode;
            currentNode.nextNode = prev;
            currentNode.prevNode = next;
            if (prev == null)
                tail = currentNode;
            if (next == null)
                head = currentNode;
            currentNode = next;
        }
    }
}
