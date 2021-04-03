package Tirgul7;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NiceQuequeTest {
    @Test
    public void test2Itemes() {
            NiceQueque<String> niceQueque = new NiceQueque<>(20);
            niceQueque.enqueue("Hello");
            niceQueque.enqueue("Girl");
            String actual_result1 = niceQueque.dequeue();
            assertEquals("Hello", actual_result1);
            String actual_result2 = niceQueque.dequeue();
            assertEquals("Girl", actual_result2);

    }

    @Test
    public void testEnqueque20Itemes() {
            NiceQueque<String> niceQueque = new NiceQueque<>(20);
            for (int i=0; i<21;i++)
            {
                    niceQueque.enqueue("Hello");
            }
            int actual_result = niceQueque.count();
            assertEquals(20,actual_result);
    }

        @Test
        public void testDequeueNull() {
                NiceQueque<String> niceQueque = new NiceQueque<>(20);
                niceQueque.dequeue();
                String actual_resulat = niceQueque.dequeue();
                assertEquals(null,actual_resulat);


        }
}
