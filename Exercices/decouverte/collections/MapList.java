package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        Map<String,List<Personne>> dico = new HashMap<>();

        for (Personne p : PersonneFactory.getPersonnesTab()) {
            List<Personne> l = dico.get(p.getFirstname());
            if (l == null){
                l = new ArrayList<>();
                dico.put(p.getFirstname(),l);
            }
            l.add(p);
        }
        for(Map.Entry <String, List<Personne>> e:dico.entrySet()) {
            System.out.println(e.getKey());
            for (Personne p: e.getValue()) {
                System.out.println("     "+p);
            }
        }
    }
}
