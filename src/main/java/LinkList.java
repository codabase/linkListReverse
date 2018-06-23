class LinkList {
    private Node head;
    Node getHead() {
        return head;
    }
    void setHead(Node head) {
        this.head = head;
    }

    /**
     * iterate from the head of the list, as you go forward change the direction of the next pointer.
     * After each iteration the current node should point to the next node
     * After each iteration the next pointer of the current node should point to previous one
     */
    void reverse() {
        Node current = head;
        Node previous = null;
        while(current.getNext() != null){
            Node temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }
        head = current;
        head.setNext(previous);
    }

}
