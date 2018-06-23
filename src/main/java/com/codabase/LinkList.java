package com.codabase;

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

    void create()
    {
        Node node = null;
        for (int i=1;i<=10;i++)
        {
            if (i==1)
            {
                node = new Node();
                node.setData(i);
                node.setNext(node);
                head=node;
            } else {
                Node nextNode = new Node();
                node.setNext(nextNode);
                nextNode.setData(i);
                node = nextNode;
            }
        }
    }

    public static void main(String[] argc)
    {
        LinkList linkList=new LinkList();
        linkList.create();
        System.out.println("The natural order of the link list.");
        printLinkList(linkList);
        System.out.println("The reverse order of the link list.");
        linkList.reverse();
        printLinkList(linkList);
    }

    private static void printLinkList(LinkList linkList) {
        Node node = linkList.getHead();
        int i=0;
        while (node!=null)
        {
            i++;
            System.out.print(String.format("%s,",node.getData()));
            node = node.getNext();
        }
        System.out.println("Done");
    }

}
