public class SinglyLinkedList {
    public Node startNode;
    public Node endNode;
    public int size ;

    public SinglyLinkedList() {
        startNode = null;
        endNode = null;
        size = 0;
    }

    //check if list is empty
    public boolean isEmpty() {
        return startNode == null;
    }

    // Append an element at endNode
    public void append(int val) {
        Node nptr = new Node(val,null);
        size++ ;
        if(startNode == null) {
            startNode = nptr;
            endNode = startNode;
        }
        else {
            endNode.setNext(nptr);
            endNode = nptr;
        }
    }

    // Delete an element from tail
    public void removeTailElement() {
        Node s = startNode;
        Node t = startNode;
        while (s != endNode)
        {
            t = s;
            s = s.getNext();
        }
        endNode = t;
        endNode.setNext(null);
        size --;
        return;
    }

    // Remove all elements that are greater than target
    public void removeNodesGreaterThanTarget(int target) {
        if (size == 0) {
            System.out.print("List is empty.\n");
            return;
        }

        Node ptr = startNode;
        Node prev = null;

        while(ptr.getData() > target) {
            startNode = ptr.getNext();
            ptr = startNode;
        }

        while (ptr != null) {
            while (ptr != null && ptr.getData() <= target) {
                prev = ptr;
                ptr = ptr.getNext();
            }

            if (ptr == null) return;

            prev.setNext(ptr.getNext());
            ptr = prev.getNext();
        }
    }
    // Display list elements
    public void show() {
        System.out.println("Singly Linked List : ");
        if (size == 0) {
            System.out.print("List is Empty.\n");
            return;
        }
        if (startNode.getNext() == null) {
            System.out.println(startNode.getData() );
            return;
        }
        Node ptr = startNode;
        System.out.print(startNode.getData()+ "-> ");
        ptr = startNode.getNext();
        while (ptr.getNext() != null) {
            System.out.print(ptr.getData()+ "-> ");
            ptr = ptr.getNext();
        }
        System.out.println(ptr.getData());
    }

    public int getSize() {
        return size;
    }
}
