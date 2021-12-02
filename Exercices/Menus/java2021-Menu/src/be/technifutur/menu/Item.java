package be.technifutur.menu;

public class Item {
    private String itemname;
    private Runnable itemaction;

    public String getName() {
        return itemname;
    }

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
