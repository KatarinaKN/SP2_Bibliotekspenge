package bibliotek;

import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public double calculateRoyalties(){
        double sumRoyalties = 0;
        for(Title t : titles){
            sumRoyalties += t.calculateRoyalties();
        }
        return sumRoyalties;
    }

    public String getName(){
        return name;
    }
}
