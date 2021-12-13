package be.technifutur.menu;

import java.util.ArrayList;

public class Item implements MenuNode {
    private String itemname;
    private Runnable itemaction;
    private ArrayList<Item> itemList = new ArrayList<>();

    @Override
    public String getName() {
        return itemname;
    }

    @Override
    public Runnable getAction() {
        return itemaction;
    }

    public void setName(String iName) {
        itemname = iName;
    }

    public void setAction(Runnable action) {
        itemaction = action;
    }
}
