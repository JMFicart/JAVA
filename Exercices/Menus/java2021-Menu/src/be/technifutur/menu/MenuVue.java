package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue {
    private Scanner input = new Scanner(System.in);

    public String saisirMenu(MenuModel model) {
        String choix;

        for (int i = 0 ; i < model.size(); i++) {
            System.out.println((i + 1) + " " + model.getItem(i).getName());
        }
        System.out.println("0 Quitter");
        System.out.print("Choix : ");
        choix = input.nextLine();
        if (choix == "0") {
            choix = "";
        }
        return choix;
    }
}
