package DataStructure;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.append("666");
        ll.append("777");
        ll.append("999");
        ll.append("777");
        ll.append("666");
        printLinkedList(ll);   // [666, 777, 999, 777, 666]


        ll.next().insert("888");
        printLinkedList(ll);   // [666, 777, 888, 999, 777, 666]

        ll.remove();
        printLinkedList(ll);   // [777, 888, 999, 777, 666]

        ll.remove("777");
        printLinkedList(ll);   // [888, 999, 666]

    }

    private static <T> void printLinkedList(LinkedList<T> ll)
    {
        StringBuilder sb = new StringBuilder();
        LinkedList<T> currentNode = ll;
        sb.append("[").append(currentNode.getData());
        while (currentNode.hasNext())
        {
            currentNode = currentNode.next();
            sb.append(", ").append(currentNode.getData());
        }
        sb.append("]");
        System.out.println(sb);
    }
}
