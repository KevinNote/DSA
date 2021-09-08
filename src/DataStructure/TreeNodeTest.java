package DataStructure;

import java.util.List;

public class TreeNodeTest
{
    public static void main(String[] args)
    {
        TreeNode<String> tr = new TreeNode<>("Root(L1)");

        System.out.println("hasChild: " + tr.hasChild());
        System.out.println("isRoot  : " + tr.isRoot());
        System.out.println("data    : " + tr.data());


        tr.addChild("C1(L2)");
        tr.addChild("C2(L2)");
        System.out.println("hasChild: " + tr.hasChild());
        List<TreeNode<String>> children = tr.getChildren();
        System.out.print("children: ");
        for (TreeNode<String> child : children)
        {
            System.out.print(child.data());
            System.out.print(" ");
        }
        System.out.println();

    }
}
