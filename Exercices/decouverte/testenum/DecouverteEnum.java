package testenum;

public class DecouverteEnum {
    public static void main(String[] args) {
        JourSemaine j = JourSemaine.Lundi;
        JourSemaine j2 = getjour();

        if(j2 == JourSemaine.Dimanche) {
            System.out.println("Dimanche");
        }
        switch (j){
            case Lundi:
                break;
            case Mardi:
                break;
        }

        System.out.println(j.name());
        System.out.println(j.ordinal());
        System.out.println(j.isWeekend());
        System.out.println(j.getNbHeures());

        j = JourSemaine.valueOf("Dimanche");
        System.out.println(j);
        JourSemaine[] values = JourSemaine.values();
        j = values[3];
        System.out.println(j);
    }

    private static JourSemaine getjour(){
        return JourSemaine.Dimanche;
    }

}
