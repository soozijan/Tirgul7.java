package Tirgul7;

import lombok.ToString;

@ToString
public class Continent {
    protected String m_name;
    protected  double m_size;
protected int m_population;

    public Continent(String m_name, double m_size, int m_population) {
        this.m_name = m_name;
        this.m_size = m_size;
        this.m_population = m_population;
    }
}
