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

        // Test for recurring
        int index2 = BinarySearch.search(s, "str1", 0, s.length - 1);
        System.out.println(index2);  // 1
        int index3 = BinarySearch.search(s, "str5", 0, s.length - 1);
        System.out.println(index3);  // -1
    }
}
