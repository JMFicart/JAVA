package classesinternes;

import collections.BirthdayNameFirstnamePersonneComparator;
import collections.Personne;
import java.util.Comparator;
import java.util.TreeSet;

public class testClasseInterne {
    private class Mycomparator implements Comparator<Personne> {
        @Override
        public int compare(Personne o1, Personne o2) {
            int i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i = o1.getFirstname().compareTo(o2.getFirstname());
                if (i == 0) {
                    i = o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
            return i;
        }

    }

    private class Mycomparator1 implements Comparator<Personne> {
        @Override
        public int compare(Personne o1, Personne o2) {
            int i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i = o1.getFirstname().compareTo(o2.getFirstname());
                if (i == 0) {
                    i = o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
            return i;
        }
    }

    public static void main(String[] args) {
        new TreeSet<Personne>(getcomparator());
    }

//    // utilisation d'une classe interne à une instance englobante.
//    private static Comparator<Personne> getcomparator(){
//        testClasseInterne enveloppe = new testClasseInterne();
//        return enveloppe.new Mycomparator();
//    }

    // utilisation d'une classe interne à une classe englobante.
//    private static Comparator<Personne> getcomparator(){
//        testClasseInterne enveloppe = new testClasseInterne();
//        return new testClasseInterne().Mycomparator();
//    }

    // utilisation d'une classe interne à une méthode
//    private static Comparator<Personne> getcomparator(){
//        class Mycomparator3 implements  Comparator<Personne>{
//            @Override
//            public int compare(Personne o1, Personne o2) {
//                int i = o1.getName().compareTo(o2.getName());
//                if (i==0){
//                    i = o1.getFirstname().compareTo(o2.getFirstname());
//                    if (i==0){
//                        i = o1.getBirthday().compareTo(o2.getBirthday());
//                    }
//                }
//                return i;
//            }
//
//        }
//        testClasseInterne enveloppe = new testClasseInterne();
//        return new testClasseInterne().Mycomparator();
//    }

    // Utilisation d'une classe anonyme interne à une méthode
//    private static Comparator<Personne> getcomparator(){
//        Comparator<Personne> comp = new Comparator<Personne>() {
//            @Override
//            public int compare(Personne o1, Personne o2) {
//                int i = o1.getName().compareTo(o2.getName());
//                if (i == 0){
//                    i = o1.getFirstname().compareTo(o2.getFirstname());
//                    if (i == 0){
//                        i = o1.getBirthday().compareTo(o2.getBirthday());
//                    }
//                }
//                return i;
//            }
//        };
//        return comp;
//    }

    // Expression Lambda
//    private static Comparator<Personne> getcomparator(){
//            return (Personne o1, Personne o2)-> {
//                int i = o1.getName().compareTo(o2.getName());
//                if (i == 0){
//                    i = o1.getFirstname().compareTo(o2.getFirstname());
//                    if (i == 0){
//                        i = o1.getBirthday().compareTo(o2.getBirthday());
//                    }
//                }
//                return i;
//            };
//        };
//    }

    // Expression Lambda : ce code ne fait qu'une comparaison sur le nom.
    private static Comparator<Personne> getcomparator() {
        return (Personne o1, Personne o2) -> o1.getName().compareTo(o2.getName());
    }
}

    //    private static Comparator<Personne> getcomparator(){
//        return new BirthdayNameFirstnamePersonneComparator();
//    }

