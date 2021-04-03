package Tirgul7;

import java.util.ArrayList;

public class NiceQueque<E>
{
    protected ArrayList<E> m_queue ;

    public NiceQueque(int size)   {
        m_queue = new ArrayList<E>(size);
    }
    public void enqueue(E item)   {
        if (m_queue.size() > 20)   {
            System.out.println("queue is full");
            return;
        }
        m_queue.add(item);
    }

    public E dequeue()   {
        if (m_queue.size()==0) {
            return null;
        }
        E next = m_queue.get(0);
        m_queue.remove(0);
        return next;
    }

    public void clear()   {
        m_queue.clear();
    }

    public int count()
    {
        return m_queue.size();
    }

    public E next()   {
        E item1 = m_queue.get(0);
        return item1;

    }
}

