package collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapUtilisation {
    public static void main(String[] args) {
        Map<LocalDate,Personne> map = new HashMap<>();

        for(Personne p : PersonneFactory.getPersonnesTab()) {
            System.out.print(p + " ");
            Personne p2 = map.put(p.getBirthday(), p);
            System.out.println(p2);
        }

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println();
        for (Map.Entry<LocalDate,Personne> e : map.entrySet()){
            LocalDate key = e.getKey();
            Personne value = e.getValue();
            System.out.printf("key %s value %s%n", key, value);
        }
        System.out.println(map.entrySet());
        System.out.println();

        LocalDate k1 = LocalDate.of(2000,1,1);
        LocalDate k2 = LocalDate.of(1990,5,14);

        System.out.println("Sélection de données existantes et inexistantes");
        // Cette date n'existe pas dans les données.
        Personne x = map.get(k1);
        System.out.println(x);
        // Cette date existe dans les données.
        Personne y = map.get(k2);
        System.out.println(y);
        System.out.println();

        System.out.println("Remove");
        Personne p1 = map.remove(k1);
        Personne p2 = map.remove(k1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
    }
}
