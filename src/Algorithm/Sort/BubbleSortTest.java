package Algorithm.Sort;

public class BubbleSortTest
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{1, 3, 7, 2, 3};
        printArray(a);          // 1 3 7 2 3
        a = BubbleSort.sort(a);
        printArray(a);          // 1 2 3 3 7
    }

    private static <T> void printArray(T[] array)
    {
        for (T v : array)
        {
            System.out.print(v);
            System.out.print(" ");
        }
        System.out.println();
    }
}
