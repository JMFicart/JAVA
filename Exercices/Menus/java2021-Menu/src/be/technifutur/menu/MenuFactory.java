package be.technifutur.menu;

import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.ExY1;
import be.technifutur.menu.actions.ExY2;
import be.technifutur.menu.actions.ExY3;
import be.technifutur.menu.actions.ExY4;

public class MenuFactory {
    private Item createItem(String itemname, Runnable itemaction) {
        Item wItem;

        wItem = new Item();
        wItem.setName(itemname);
        wItem.setAction(itemaction);
        return wItem;
    }

    public Runnable getMenu() {
        MenuControler mc = new MenuControler();
        MenuModel mm = new MenuModel();
        MenuVue mv = new MenuVue();

        initMenu(mm); // Charger les options du menu dans le MenuModel
        mc.setModel(mm);
        mc.setVue(mv);

        return mc.getAction();
    }

    private void initMenu(MenuModel menu) {
        menu.addItem(getItemHelloWorld());
        menu.addItem(getItemExY1());
        menu.addItem(getItemExY2());
        menu.addItem(getItemExY3());
        menu.addItem(getItemExY4());
    }

    public Item getItemHelloWorld() {
        return createItem("Hello World", new HelloWorld());
    }

    public Item getItemExY1() {
        return createItem("5 numbers in an array", new ExY1());
    }

    public Item getItemExY2() {
        return createItem("Test de la présence d'une chaîne", new ExY2());
    }

    public Item getItemExY3() {
        return createItem("Deviner un nombre", new ExY3());
    }

    public Item getItemExY4() {
        return createItem("Diagonales d'un carré", new ExY4());
    }

}
