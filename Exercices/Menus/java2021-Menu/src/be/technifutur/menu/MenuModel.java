package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel {
    private ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item getItem(int pos) {
        if (pos >= 0 && pos < itemList.size())
        {
            return itemList.get(pos);
        }
        else
        {
            return null;
        }
    }

    public int size() {
        return itemList.size();
    }
}
