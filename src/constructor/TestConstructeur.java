package decouverte.java.constructor;

public class TestConstructeur {
    public static void main (String[] args) {
        Desc desc = new Desc();
        System.out.println(desc.toString());
        desc = new Desc(25);
        System.out.println(desc);
    }
}

class Desc extends Anc {
    private int i_desc;

    Desc(){
        //super(4); // appelle le constructeur de l'ancêtre
        this(init());
        i_desc = 5;
        i_anc = 3;
    }

    private static int init() {
        return 4;
    }

    Desc(int val){
        super(val);
        i_desc = val;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDesc{i_desc=" + this.i_desc + "}";
    }
}

class Anc {
    protected int i_anc = 1;
    int i = i_anc;

    { // Initialisateur d'instance
        i_anc = i;
        i = i_anc + 1;
    }

    Anc(int valAnc){
        super();
        i_anc = valAnc;
    }

    @Override
    public String toString() {
        return "Anc{i_anc=" + i_anc + ", i=" + i +"}";
    }
}
