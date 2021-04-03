package Tirgul7;

import java.util.Comparator;

public class ContinentSortBySize implements Comparator<Continent> {

    @Override
    public int compare(Continent o1, Continent o2) {
        if (o1.m_size > o2.m_size)   {
            return 1;
        }
        else if (o1.m_size < o2.m_size)   {
            return -1;
        }
        return 0;

    }
}
