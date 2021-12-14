package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDecouverte {
    public static void main(String[] args) {
//        HashSet<Personne> personnes = new HashSet<>();
        TreeSet<Personne> personnes = new TreeSet<>(new BirthdayNameFirstnamePersonneComparator());

        Personne[] personnesTab = PersonneFactory.getPersonnesTab();
        for (Personne p : PersonneFactory.getPersonnesTab()) {
            boolean added = personnes.add(p);
            System.out.println(added + " : " + p);
        }
        System.out.println("");
        for (Personne p : personnes) {
            System.out.println(p);
        }
    }
}
