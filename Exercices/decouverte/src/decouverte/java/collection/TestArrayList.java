package decouverte.java.collection;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());

        list.add("Lulu");
        list.add("Chuchu");
        list.add("Dodo");
        list.add("TT");
        list.add("Toto");
        list.add("Momo");
        list.add("Lala");
        list.add("Coco");
        list.add("Nana");
        list.add("DD");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
