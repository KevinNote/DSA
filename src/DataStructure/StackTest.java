package DataStructure;

public class StackTest
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<>(5);

        System.out.println("Size: " + s.getSize());

        s.push("1");
        s.push("2");
        System.out.println("[0]: " + s.get(0));
        System.out.println(s.pop());
        System.out.println(s.pop());

        s.push("5");
        System.out.println("Count: " + s.itemCount());
        s.pop();

        for (int i = 0; i < 6; ++i)
        {
            try
            {
                s.push(Integer.toString(i));
            }
            catch (Exception e)
            {
                System.out.println("[E] i = " + i + "\nMSG: " + e.getMessage());

                for (Stack<String> it = s; it.hasNext(); )
                {
                    String str = it.next();

                    System.out.print(str + " + ");
                }
            }
        }
    }
}
