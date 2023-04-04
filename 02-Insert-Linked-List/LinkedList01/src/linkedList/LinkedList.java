package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }

    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }


    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead()
    {
        System.out.println("Head: " + head.value);
    }

    public void getTail()
    {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength()
    {
        System.out.println("Length: " + length);
    }

//    ------------------------ APPEND

    public void appendNode(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
        head=newNode;
        tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public void removeLast()
    {
        if(length==0)
        {
            return;
        }
            Node currentNode = head;

            while(currentNode.next==null)
            {
                currentNode = head.next;
            }

    }

}
