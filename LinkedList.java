public class LinkedList {
    private Node root;

    public LinkedList() {
        this.root = null;
    }

    public void addNode(int value) {
        Node sub = this.root;
        if (sub == null) {
            sub = new Node(value);
            return;
        }
        while (sub.getNext() != null)
            sub = sub.getNext();
        sub.setNext(new Node(value));
    }
}