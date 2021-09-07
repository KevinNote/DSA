package DataStructure;

public class StackTest
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<>(5);

        System.out.println("Size: " + s.getSize());

        s.push("1");
        s.push("2");
        System.out.println("[0]: " + s.get(0));        // [0]: 1
        System.out.println(s.pop());                   // 2
        System.out.println(s.pop());                   // 1

        s.push("5");
        System.out.println("Count: " + s.itemCount()); // Count: 1
        s.pop();

        for (int i = 0; i < 6; ++i)
        {
            try
            {
                s.push(Integer.toString(i));
            }
            catch (Exception e)
            {
                // [E] i = 5
                // MSG: Stack is full!
                System.out.println("[E] i = " + i + "\nMSG: " + e.getMessage());

                // 0 + 1 + 2 + 3 + 4 +
                for (Stack<String> it = s; it.hasNext(); )
                {
                    String str = it.next();

                    System.out.print(str + " + ");
                }
            }
        }
    }
}
