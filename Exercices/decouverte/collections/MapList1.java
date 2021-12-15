package collections;

import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList1 {
    public static void main(String[] args) {
        Map<Integer, List<Personne>> dico = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        Integer year;

        for (Personne p : PersonneFactory.getPersonnesTab()) {
//            System.out.println(Integer.parseInt(p.getBirthday().format(formatter)));
            year = Integer.parseInt(p.getBirthday().format(formatter));
            List<Personne> l = dico.get(year);
            if (l == null) {
                l = new ArrayList<>();
                dico.put(year, l);
            }
            l.add(p);
        }
        for(Map.Entry <Integer, List<Personne>> e:dico.entrySet()) {
            System.out.println(e.getKey());
            for (Personne p: e.getValue()) {
                System.out.println("     "+p);
            }
        }
    }
}
