package ie.atu.Sem2Week1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();

        items.add(new Burger("Cheese Burger", 6.99, "Sauce, Onion, Pickle, Cheese"));
        items.add(new Pizza("Pineapple", 10.99, "Tomato Sauce, Cheese, Ham, Pineapple"));
        items.add(new Salad("Caesar", 9.99, "A little lame, but it's ok."));

        for(MenuItem item : items){
            System.out.println(item);
        }

    }
}
