package DataStructure;

public class LinkedList<T>
{
    //region Constructor
    public LinkedList()
    {

    }

    public LinkedList(T data)
    {
        _data = data;
    }

    public LinkedList(T data, LinkedList<T> next)
    {
        this(data);
        _next = next;
    }
    //endregion

    //region Property _data
    private T _data;

    public T getData()
    {
        return _data;
    }

    public void setData(T data)
    {
        _data = data;
    }
    //endregion

    //region Property _next
    private LinkedList<T> _next;

    public boolean hasNext()
    {
        return _next != null;
    }

    public LinkedList<T> next()
    {
        return _next;
    }

    public void setNext(T next)
    {
        setNext(new LinkedList<>(next));
    }

    public void setNext(LinkedList<T> next)
    {
        _next = next;
    }
    //endregion

    public void append(T data)
    {
        LinkedList<T> currentNode = this;
        if (currentNode.getData() == null)
        {
            currentNode.setData(data);
            return;
        }
        while (currentNode.hasNext())
        {
            currentNode = currentNode.next();
        }
        currentNode.setNext(data);
    }

    //region Method remove
    public void remove()
    {
        if (!hasNext())
        {
            setData(null);
            return;
        }
        setData(next().getData());
        setNext(next().next());
    }

    public void remove(T data)
    {
        LinkedList<T> currentNode = this;
        while (true)
        {
            if (currentNode.getData().equals(data))
                currentNode.remove();

            if (currentNode.hasNext())
                currentNode = currentNode.next();
            else
                break;
        }
    }
    //endregion

    public void insert(T data)
    {
        LinkedList<T> n = next();
        setNext(data);
        next().setNext(n);
    }

    public int count()
    {
        int count = 1;
        LinkedList<T> r = this;

        while (r.hasNext())
        {
            ++count;
            r = r.next();
        }
        return count;
    }
}