package Tirgul7;

import java.util.Comparator;

public class ContinentSortByPopulation implements Comparator<Continent> {
    @Override
    public int compare(Continent o1,Continent o2) {

       if (o1.m_population > o2.m_population)   {
           return 1;
       }
       else if (o1.m_population < o2.m_population)   {
           return -1;
}
       return 0;

}
}
