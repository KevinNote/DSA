package DataStructure;

import java.util.List;

public class TreeNodeTest
{
    public static void main(String[] args)
    {
        TreeNode<String> tr = new TreeNode<>("Root (L0)");
        printTreeNodeInfo(tr);

        System.out.println();

        tr.addChild("C1 (L1)");
        tr.addChild("C2 (L1)");
        System.out.println("hasChild: " + tr.hasChild());
        printTreeChildInfo(tr);
    }

    public static <T> void printTreeNodeInfo(TreeNode<T> tr)
    {
        System.out.println("level   : " + tr.getLevel());
        System.out.println("hasChild: " + tr.hasChild());
        System.out.println("isRoot  : " + tr.isRoot());
        System.out.println("data    : " + tr.data());
        System.out.println("isLeaf  : " + tr.isLeaf());
    }

    public static <T> void printTreeChildInfo(TreeNode<T> tr)
    {
        List<TreeNode<T>> children = tr.getChildren();

        if (children == null || children.size() == 0)
        {
            System.out.println("There is no child here!");
            return;
        }

        for (TreeNode<T> child : children)
        {
            printTreeNodeInfo(child);
            System.out.println();
        }
    }
}
