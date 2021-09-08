package Algorithm.Search;

public class LinearSearch
{
    public static <T> int search(T[] array, T item)
    {
        for (int i = 0; i < array.length; ++i)
        {
            if (array[i].equals(item))
                return i;
        }
        return -1;
    }
}
