package DataStructure;

public class Queue<T>
{
    private LinkedList<T> _list;

    public void enqueue(T item)
    {
        if (_list == null)
        {
            _list = new LinkedList<>(item);
            return;
        }
        _list.append(item);
    }

    public T dequeue()
    {
        if (_list == null)
            return null;
        T r = _list.getData();
        _list = _list.next();
        return r;
    }

    public void clear()
    {
        _list = null;
    }

    public int count()
    {
        if (_list == null)
            return 0;

        return _list.count();
    }
}