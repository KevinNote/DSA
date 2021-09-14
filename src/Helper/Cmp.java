package Helper;

public class Cmp
{
    public enum CmpType
    {
        Greater,
        Equal,
        Less
    }

    public static CmpType Compare(int compareTo)
    {
        if (compareTo < 0)
            return CmpType.Less;
        if (compareTo > 0)
            return CmpType.Greater;
        return CmpType.Equal;
    }

    public static <T extends Comparable<T>> CmpType Compare(T objA, T objB)
    {
        return Compare(objA.compareTo(objB));
    }
}
