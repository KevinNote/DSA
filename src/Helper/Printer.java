package Helper;

public class Printer
{
    public static <T> void printArray(T[] array)
    {
        for (T v : array)
        {
            System.out.print(v);
            System.out.print(" ");
        }
        System.out.println();
    }
}
