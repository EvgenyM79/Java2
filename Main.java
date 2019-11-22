public class Main {

    public static void main(String[] args) {
        ListNode newList = new ListNode();
        newList.addFirst(4);
        newList.addLast(35);
        newList.addFirst(27);
        newList.addLast(55);
        newList.addFirst(45);
        newList.addLast(23);
        newList.addFirst(19);
        newList.addLast(21);
        newList.addFirst(12);
        newList.displayList();
        newList.removeFirst();
        newList.displayList();
        newList.removeFirst();
        newList.displayList();
        newList.removeFirst();
        newList.displayList();
        newList.removeLast();
        newList.displayList();
    }

}