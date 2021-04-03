package Tirgul7;

import java.util.Comparator;

public class ContinentSortByName implements Comparator<Continent> {

    @Override
    public int compare (Continent o1, Continent o2)  {
        return o1.m_name.compareTo((o2.m_name));
    }
}
