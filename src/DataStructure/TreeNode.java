package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T>
{
    //region: Property: Constructor
    public TreeNode(T data)
    {
        setData(data);
    }
    //endregion

    //region Property: Parent
    private TreeNode<T> _parent;

    public TreeNode<T> parent()
    {
        return _parent;
    }

    public void setParent(TreeNode<T> parent)
    {
        _parent = parent;
    }

    public boolean hasParent()
    {
        return parent() != null;
    }

    public boolean isRoot()
    {
        return !hasParent();
    }

    //endregion

    //region Property: Children
    private List<TreeNode<T>> _children;

    public boolean hasChild()
    {
        return _children != null && !_children.isEmpty();
    }

    public void addChild(T data)
    {
        addChild(new TreeNode<T>(data));
    }

    public void addChild(TreeNode<T> child)
    {
        child.setParent(this);
        if (_children == null)
            _children = new ArrayList<>();
        _children.add(child);
    }

    public void removeChild(TreeNode<T> child)
    {
        if (_children == null)
            return;
        _children.remove(child);
    }
    // TODO: removeChild(T data)

    public List<TreeNode<T>> getChildren()
    {
        return _children;
    }

    public boolean isLeaf()
    {
        return _children == null || _children.size() == 0;
    }
    //endregion


    //region Property: Data
    private T _data;

    public T data()
    {
        return _data;
    }

    public void setData(T data)
    {
        _data = data;
    }
    //endregion

    public int getLevel()
    {
        if (isRoot())
        {
            return 0;
        }
        else
        {
            return parent().getLevel() + 1;
        }
    }
}
