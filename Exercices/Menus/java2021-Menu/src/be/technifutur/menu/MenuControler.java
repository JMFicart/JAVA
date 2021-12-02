package be.technifutur.menu;

public class MenuControler {
    private MenuModel model;
    private MenuVue vue;

    public void setModel(MenuModel model){
        this.model = model;
    }

    public void setVue(MenuVue vue) {
        this.vue = vue;
    }

    public Runnable getAction() {
        int choix = 0;
        String reponse = "";

        reponse = vue.saisirMenu(model);
        if (reponse != "") {
            choix = Integer.parseInt(reponse);
            choix--;
            if (model.getItem(choix) != null) {
                return model.getItem(choix).getAction();
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
}
