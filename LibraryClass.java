package Tirgul7;

import java.util.HashMap;

public class Library {
    protected HashMap<String, Integer> m_booksMap = new HashMap<>();

    public void addNewBook(String name, Integer shelf)   {
        m_booksMap.put(name,shelf);
    }
    public int searchForBook(String book) {
        if (m_booksMap.containsKey(book)) {
            return m_booksMap.get(book);
        }
    else {
        return -1;
        }
    }



    public void remove(String book)   {
        if (m_booksMap.containsKey(book))  {
            m_booksMap.remove(book);
        }
        else {
            System.out.println("This book is not in the Library");
        }

    }
    public int count()    {
      return m_booksMap.size();

    }
    public int countShelfs()   {
        return m_booksMap.values().size();
    }

}

