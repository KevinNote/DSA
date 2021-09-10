package Algorithm.Sort;

import Helper.Cmp;

public class BubbleSort
{
    public static <T extends Comparable<T>> T[] sort(T[] array)
    {
        T[] a = array.clone();

        if (a.length <= 1)
            return a;

        boolean isSorted;
        while (true)
        {
            isSorted = true;
            for (int i = 0; i < array.length - 1; ++i)
            {
                Cmp.CmpType cmp = Cmp.Compare(a[i].compareTo(a[i + 1]));
                if (cmp == Cmp.CmpType.Greater)
                {
                    isSorted = false;
                    //System.out.println(a[i] + "<=>" + a[i + 1]);
                    T v = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = v;
                }
            }

            if (isSorted)
                return a;
        }
    }
}
