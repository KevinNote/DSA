package Algorithm.Sort;

import Helper.Cmp;

public class SelectionSort
{
    public static <T extends Comparable<T>> T[] sort(T[] array)
    {
        T[] a = array.clone();

        if (a.length <= 1)
            return a;

        for (int i = 0; i < array.length - 1; ++i)
        {
            int min = i;
            for (int j = 1; j < array.length; ++j)
            {
                int cmp = a[min].compareTo(a[j]);
                Cmp.CmpType ct = Cmp.Compare(cmp);

                if (ct == Cmp.CmpType.Greater)
                {
                    min = j;
                }
            }

            T v = a[min];
            a[min] = a[i];
            a[i] = v;
        }
        return a;
    }
}
