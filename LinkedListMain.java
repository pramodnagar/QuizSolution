public class LinkedListMain {
    public static void main(String[] args)
    {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(15);
        linkedList.append(47);
        linkedList.append(12);
        linkedList.append(9);
        linkedList.show();

        linkedList.removeTailElement();
        linkedList.show();

        linkedList.removeNodesGreaterThanTarget(12);
        linkedList.show();
    }
}
