public class PostOfficeTest {

    @Test
    public void testAddBoxesAndCustomers() {
        Queue<String> customers = new PriorityQueue<>();
        customers.add("moshe");
        customers.add("adina");
        customers.add("yakir");

        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box("iPhone","moshe"));
        boxes.add(new Box("Camera","adina"));
        boxes.add(new Box("TV","yakir"));

        PostOffice postOffice = new PostOffice(boxes, customers);

        String actual_result_1 = postOffice.serveNextCustomer();
        assertEquals("iPhone",actual_result_1);

        String actual_result_2 = postOffice.serveNextCustomer();
        assertEquals("Camera", actual_result_2);

        String actual_result_3 = postOffice.serveNextCustomer();
        assertEquals("TV", actual_result_3);

    }
}
