package testenum;

public enum JourSemaine {
    Lundi(false), 
    Mardi(false), 
    Mercredi(false,4),
    Jeudi(false), 
    Vendredi(false), 
    Samedi(true),
    Dimanche(true);
    
    private boolean weekEnd;
    private int nbHeures;
    
//    private JourSemaine(boolean weekEnd){
//        this(weekEnd, weekEnd?0:8);
//    }
//
//    private JourSemaine(boolean weekEnd, int nbHeures){
//        this.weekEnd = weekEnd;
//        this.nbHeures = nbHeures;
//    }

    private JourSemaine(boolean weekEnd){
        this.weekEnd = weekEnd;
        this.nbHeures = weekEnd?0:8;
    }

    private JourSemaine(boolean weekEnd, int nbHeures){
        this(weekEnd);
        this.nbHeures = nbHeures;
    }

    public boolean isWeekend() {
        return weekEnd;
    }

    public int getNbHeures(){
        return nbHeures;
    }
}
