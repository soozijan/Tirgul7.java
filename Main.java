 //שאלה 1
        LocalDateTime myDate = LocalDateTime.of(1984, 4, 15,7,00);
        System.out.println(myDate);

//שאלה 3
        ArrayList<Continent> continentArrayList = new ArrayList<>();
       continentArrayList.add(new Continent("Africa", 100000004, 4));
        continentArrayList.add(new Continent("America", 100008754, 2));
        Collections.sort(continentArrayList,new ContinentSortByName());
        System.out.println(continentArrayList);

//שאלה 11
        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("beautiful");
        stack.push("Java");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

 //שאלה 12
        Queue<Double> myQueue = new ArrayDeque<Double>();
        myQueue.add(8.23);
        myQueue.add(7.587);
        myQueue.add(6.2547);
        System.out.println(myQueue);
        System.out.println();
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
       System.out.println(myQueue.peek());

        myQueue.remove();

 // שאלה 13
        ArrayList<Box> box = new ArrayList<>();
        Box box1 = new Box("iphone","Moshe");
        Box box2 = new Box("Tablet","Nissim");
        Box box3 = new Box("Canon","Royi");
        Box box4 = new Box("Shiumi","Pered");
        Box box5 = new Box("iphon 6","Liran");

//שאלה 21
        try {
            int a = 30;
            int b = 0;
            int c = a / b;
        }
        catch (Exception exception)   {
            System.out.println("Ooops");
        }
        

