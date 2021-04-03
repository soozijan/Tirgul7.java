package Tirgul7;

import java.util.ArrayList;
import java.util.Queue;

public class PostOffice {
    protected ArrayList<Box> boxes;
    protected Queue<String> customers;

    public PostOffice(ArrayList<Box> boxes, Queue<String> customers) {
        this.boxes = boxes;
        this.customers = customers;
    }
    public PostOffice(){
        boxes.add(new Box("iphone X", "Moshe"));
        boxes.add(new Box("Tablet", "Nissim"));
        boxes.add(new Box("Canon", "Royi"));
        boxes.add(new Box("Shiumi", "Pered"));
        boxes.add(new Box("iphone 6", "Liran"));
        customers.add("Moshe");
        customers.add("Nissim");
        customers.add("Royi");
        customers.add("Pered");
        customers.add("Liran");
    }

    public void newBoxArrived(Box box) {
        // לקבל box ולהוסיף לרשימה
        // להוסיף את הנמען של ה-box לתור
        boxes.add(box);
        customers.add(box.owner);
    }
    public String serveNextCustomer()   {
        String customer = customers.poll();
        System.out.println(customer);
        for (Box box: boxes) {
            if (box.owner == customer) {
                System.out.println(box.content);
                boxes.remove(box);
                return box.content;
            }
        }
        return "no box";
    }


}



