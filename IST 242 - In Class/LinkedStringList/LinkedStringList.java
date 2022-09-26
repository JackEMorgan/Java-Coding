import java.util.NoSuchElementException;

public class LinkedStringList {

    private Node first;
    private Node currentNode;
    private int length;

    class Node
    {
        private String data;
        private Node next;

        public void printNodeData()
        {
            System.out.println("Node data: " + this.data);
        }

        public Node getNext()
        {
            return this.next;
        }
    }

    public LinkedStringList()
    {
        first = null;
        currentNode = null;
        length = 0;
    }

    public void addFirst(String value)
    {
        //Create the node & set its value
        Node newNode = new Node();
        newNode.data = value;

        //if newNode is the first node, this will be null
        //else, it will point to the former "first" now
        newNode.next = first;

        //update "first" to point to node we just created
        first = newNode;

        currentNode = newNode;
        length++;
    }

    public void setFirstValue(String value)
    {
        first.data = value;
    }

    public void setCurrentValue(String value)
    {
        currentNode.data = value;
    }

    public void moveNext()
    {
        if (currentNode.next == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            currentNode = currentNode.next;
        }
    }

    public void moveFirst()
    {
        currentNode = first;
    }

    public boolean isEmpty()
    {
        return(first==null);
    }

    public int getLength()
    {
        return length;
    }

    public String getFirstValue()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return(first.data);
        }
    }

    public String getCurrentValue()
    {
        if (currentNode == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return(currentNode.data);
        }
    }

    public void displayList()
    {
        Node tempNode = first;
        System.out.println("List contents:");
        while(tempNode != null)
        {
            tempNode.printNodeData();
            tempNode = tempNode.getNext();
        }
    }
}