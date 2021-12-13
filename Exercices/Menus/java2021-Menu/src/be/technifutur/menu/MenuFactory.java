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

    public MenuControler getMenu() {
        return CreateMenu(getModelPrincipal());
    }

    private MenuControler CreateMenu(MenuModel model) {
        MenuControler menu = new MenuControler();
        menu.setVue(new MenuVue());
        menu.setModel(model);
        return menu;
    }

    private MenuModel getModelPrincipal(){
        MenuModel model = new MenuModel("Menu principal");
        model.addNode(getItemHelloWorld());
        MenuNode sousmenu = CreateMenu(getModelExercice());
        model.addNode(sousmenu);
        model.addNode(getItemQuitter());
        return model;
    }

    private MenuModel getModelExercice(){
        MenuModel model = new MenuModel("Menu exercices");
        model.addNode(getItemExY1());
        model.addNode(getItemExY2());
        model.addNode(getItemExY3());
        model.addNode(getItemExY4());
        model.addNode(getItemQuitter());
        return model;
    }

//    private void initMenu(MenuModel menu) {
//        menu.addNode(getItemHelloWorld());
//        menu.addNode(getItemExY1());
//        menu.addNode(getItemExY2());
//        menu.addNode(getItemExY3());
//        menu.addNode(getItemExY4());
//        menu.addNode(getItemQuitter());
//    }

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

    private Item getItemQuitter() {return createItem("Quitter", null );}
}

