package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue {
    private Scanner input = new Scanner(System.in);
    private String error = null;

    public void setError(String message){
        this.error = message;
    }

    public String saisirMenu(MenuModel model) {
        String choix;
        String souligne = "-";

        System.out.println(model.name);
        souligne = souligne.repeat(model.name.length());
        System.out.println(souligne);
        for (int i = 0 ; i < model.size(); i++) {
            System.out.println((i + 1) + " " + model.getNode(i).getName());
        }
        if (this.error != null) {
            System.out.printf("Error : %s\n", error);
        }
        System.out.print("Choix : ");
        choix = input.nextLine();
        return choix;
    }
}
