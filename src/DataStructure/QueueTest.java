package DataStructure;

public class QueueTest
{
    public static void main(String[] args)
    {
        Queue<String> q = new Queue<>();
        q.enqueue("Q1");
        q.enqueue("Q2");
        System.out.println(q.dequeue()); // Q1

        q.enqueue("Q3");
        System.out.println(q.dequeue()); // Q2
        System.out.println(q.dequeue()); // Q3
    }
}
