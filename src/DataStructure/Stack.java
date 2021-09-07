package DataStructure;

import java.util.Iterator;

public class Stack<T> implements Iterator<T>
{
    private T[] _items;
    private int _size = 0;
    private int _index = 0;

    public int getSize()
    {
        return _size;
    }

    public int itemCount()
    {
        return _index;
    }

    public Stack(int size)
    {
        _size = size;
        clear();
    }

    public boolean isEmpty()
    {
        return _size > 0 && _index == 0;
    }

    public boolean isFull()
    {
        return _size == _index;
    }

    public void push(T item)
    {
        if (isFull())
            throw new IllegalArgumentException("Stack is full!");

        _items[_index++] = item;
    }

    public T pop()
    {
        if (isEmpty())
            return null;

        --_index;
        T v = _items[_index];
        _items[_index] = null;
        return v;
    }

    public T get(int index)
    {
        if (index >= _index || index < 0)
            return null;
        return _items[index];
    }

    public void clear()
    {
        _items = (T[]) (new Object[_size]);
    }


    private int _currentPosition = 0;
    @Override
    public boolean hasNext()
    {
        if (_currentPosition >= _index)
        {
            _currentPosition = 0;
            return false;
        }
        return true;
    }

    @Override
    public T next()
    {
        ++_currentPosition;
        return _items[_currentPosition - 1];
    }
}