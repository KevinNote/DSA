package Algorithm.Search;

public class BinarySearch
{
    public static <T extends Comparable<T>> int search(T[] sortedArray, T item)
    {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            int cmp = sortedArray[mid].compareTo(item);

            if (cmp == 0)        // sortedArray[mid] == item
                return mid - 1;  // Don't forget -1
            else if (cmp < 0)    // sortedArray[mid] < item
                start = mid + 1; // Don't forget +1
            else                 // sortedArray[mid] > item
                end = mid;

        }
        return -1;
    }
}
