package Algorithm.Sort;

import static Helper.Printer.printArray;

public class BubbleSortTest
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{1, 3, 7, 2, 3};
        printArray(a);          // 1 3 7 2 3
        a = BubbleSort.sort(a);
        printArray(a);          // 1 2 3 3 7
    }
}
