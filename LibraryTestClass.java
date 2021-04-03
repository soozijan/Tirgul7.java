package Tirgul7;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    @Test
    public void testAddNewBooks()  {
        Library library = new Library();
        library.addNewBook("Apples",5);
        library.addNewBook("Travel",13);
        library.addNewBook("Childhood",20);

        int actual_shelf_1 = library.searchForBook("Apples");
        assertEquals(5, actual_shelf_1);

        int actual_shelf_2 = library.searchForBook("Travel");
        assertEquals(13, actual_shelf_2);

        int actual_shelf_3 = library.searchForBook("Childhood");
        assertEquals(20, actual_shelf_3);

    }

    @Test
    public void testSearchForBookFalse() {
        Library library = new Library();
        int actual_result_false = library.searchForBook("opsjkfdsokljgkolsdfg");
        assertEquals(-1,actual_result_false);
    }




}
