package collections;

import java.util.*;

public class Iteratives {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //Set<String> list = new HashSet<>();
        //Set<String> list = new LinkedHashSet<>();
        Set<String> list = new TreeSet<>();

        list.add("toto");
        list.add("toto");
        list.add("toto");
        list.add("dédé");
        list.add("lulu");
        list.add("chuchu");

        Iterable<String>  itFactory = list;

//        //Iterator<String> iterator =itFactory.iterator();
//        System.out.println("Boucle While");
//        while(itFactory.iterator().hasNext()) {
//            // La méthode iterator() crée un itérateur qui se positionne au début de la liste et
//            // donc seul le premier élément est affiché.
//            String s = itFactory.iterator().next();
//            System.out.println(s);
//        }

        Iterator<String> iterator =itFactory.iterator();
        System.out.println("Boucle While");
        while(iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("Boucle For Each");
        for(String s : itFactory) {
            System.out.println(s);
        }

        for(String s : itFactory) {
            s = s + "--";
            System.out.println(s);
        }

        Collection<Integer> ci = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer i : ci){
            i++;
        }
        for (Integer i : ci){
            // La valeur interne des éléments n'est pas modifiée.
            System.out.println(i);
        }
    }
}
