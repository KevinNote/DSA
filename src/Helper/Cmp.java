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
}
