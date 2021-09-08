package Algorithm.Search;

public class LinearSearchTest
{
    public static void main(String[] args)
    {
        String[] s = new String[]{"str0", "str1", "str2"};
        int index0 = LinearSearch.search(s, "str1");
        System.out.println(index0);  // 1
        int index1 = LinearSearch.search(s, "str5");
        System.out.println(index1);  // -1
    }
}
