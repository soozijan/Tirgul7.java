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

