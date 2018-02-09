public class Node {
    public int data;
    public Node next;

    public Node() {
        next = null;
        data = 0;
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public int getData() {
        return data;
    }
}
