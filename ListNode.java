public class ListNode {

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.value = val;
        }

        // Вывод списка
        public void displayNode() {
            System.out.print(value + " ");
        }
    }

    //both should be private, nobody outside should see the node class
    public Node first = null;
    public Node last = null;
    public Node temp = null;
    public int size = 0;

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
            System.out.println("newNode " + newNode);
            System.out.println("newNode.value " + newNode.value);
            System.out.println("newNode.next " + newNode.next);
            System.out.println("first" + first);
            System.out.println("last " + last);
        } else {
            System.out.println("newNode.value " + newNode.value);
            System.out.println("first.prev " + first.prev);
            System.out.println("newNode " + newNode);
            System.out.println("newNode.next " + newNode.next);
            System.out.println("newNode.value" + newNode.value);
            System.out.println("first" + first);
            System.out.println("last " + last);
            first.next = newNode;
            newNode.next = first;
            first = newNode;
            System.out.println("newNode " + newNode);
            System.out.println("newNode.value " + newNode.value);
            System.out.println("newNode.next " + newNode.next);
            System.out.println("newNode.value" + newNode.value);
            System.out.println("first" + first);
            System.out.println("last " + last);
        }
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;

        } else {
            first.prev = newNode;
            newNode.next = first;
            newNode.prev = null;
            first = newNode;
            last.prev = newNode;
            newNode.next = null;
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        Node current = first;
        size = 0;
        while (current != null) {
            current.displayNode();
            current = current.next;
            size++;
        }
        System.out.println(" Число элементов равно " + size);
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first;

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println(temp.value + " удалено");
        }
    }

    public void removeLast() {
        Node temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println(temp.value + " удалено");
    }
}