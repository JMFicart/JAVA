package constructor;

public class TestEquals {
    public static void main (String[] args) {
        Personne p1 = new Personne("Dupont", "Toto", "etudiant");
        Personne p2 = new Personne("Dupont", "Toto", "etudiant");
        Personne p3 = p1;
        Personne p4 = new Personne("Dupont", "Lulu", "etudiant");
        Personne p5 = new Personne("Dupont", "Toto", "plombier");

        System.out.println("p1 = p2 : " + p1.equals(p2));
        System.out.println("p1 = p3 : " + p1.equals(p3));
        System.out.println("p1 = p4 : " + p1.equals(p4));
        System.out.println("p1 = p5 : " + p1.equals(p5));
    }
}
