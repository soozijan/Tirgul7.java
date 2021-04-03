 //שאלה 1
        LocalDateTime myDate = LocalDateTime.of(1984, 4, 15,7,00);
        System.out.println(myDate);

//שאלה 3
        ArrayList<Continent> continentArrayList = new ArrayList<>();
       continentArrayList.add(new Continent("Africa", 100000004, 4));
        continentArrayList.add(new Continent("America", 100008754, 2));
        Collections.sort(continentArrayList,new ContinentSortByName());
        System.out.println(continentArrayList);

