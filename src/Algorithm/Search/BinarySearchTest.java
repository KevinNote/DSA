package Algorithm.Search;

public class BinarySearchTest
{
    public static void main(String[] args)
    {
        String[] s = new String[]{"str0", "str1", "str2"};
        int index0 = BinarySearch.search(s, "str1");
        System.out.println(index0);  // 1
        int index1 = BinarySearch.search(s, "str5");
        System.out.println(index1);  // -1
    }
}
