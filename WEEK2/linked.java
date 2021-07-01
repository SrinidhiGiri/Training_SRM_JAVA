package Day8.com;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class linked
{
    Node head;
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public boolean search(Node head, int x)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }
    public static void main(String args[])
    {
        linked llist = new linked();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);

        if (llist.search(llist.head, 7))
            System.out.println("The element is in the list");
        else
            System.out.println("The element is not in the list");
    }
}

