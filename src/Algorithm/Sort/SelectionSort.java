package Algorithm.Sort;

import Helper.Cmp;

public class SelectionSort
{
    public static <T extends Comparable<T>> T[] sort(T[] array)
    {
        T[] a = array.clone();

        if (a.length <= 1)
            return a;

        for (int i = 0; i < a.length - 1; ++i)
        {
            int min = i;
            for (int j = i + 1; j < a.length; ++j)
            {
                if (Cmp.Compare(a[min], a[j]) == Cmp.CmpType.Greater)
                    min = j;
            }

            T v = a[min];
            a[min] = a[i];
            a[i] = v;
        }
        return a;
    }
}
