package calendrierdesstars;

import java.util.*;

public class StarFactory {
    public static void main(String[] args) {
        Map<String, List<Star>> repstar = new HashMap<>();
        List<Star> starlist = TrtFichier1.readfile();
        List<Star> starlist1 = TrtFichier2.readfile();

//        *Le nombre de stars nées dans les années 60
//        *Le nombre de stars nées dans les années 60
//        *Créer un sortedset trié sur le nom
//        *Créer un sortedset trié sur la date de naissance
//        *Créer un répertoire où les stars sont regroupées sur la première lettre de leur nom
//        Le nombre de stars, reprises dans le répertoire à une clé donnée, qui sont nées dans les années 60
//        Retourner la star dont on passe le nom dans le répertoire
//        Le nombre de stars nées après une star dont on passe le nom

        // Affichage des stars nées dans les années 60.
        System.out.println("Fichier star1.txt = " + star60(starlist));
        System.out.println("Fichier star2.txt = " + star60(starlist1));

        // Création d'un SortedSet trié sur le nom et un autre SortedSet trié sur la date de naissance.
        TreeSet<Star> sortedset1 = new TreeSet<>(new StarComparatorNameDate());
        TreeSet<Star> sortedset2 = new TreeSet<>(new StarComparatorDateName());

        sortedset1 = creerset1(starlist);
        sortedset2 = creerset2(starlist);

        // Création d'un répertoire où les stars sont regroupées sur la première lettre de leur nom.
        repstar = creerstarrepertoire(sortedset1);

        // Retourner la star dont on passe le nom dans le répertoire
        Scanner sc = new Scanner(System.in);
        List<Star> listsearch;
        String starname = "";
        String initiale = "";

        System.out.print("Entrez la star à retrouver : ");
        starname = sc.nextLine();
        initiale = starname.substring(0,1).toUpperCase();
        if (repstar.containsKey(initiale)== true) {
            System.out.println(starname + " trouvé.");
            listsearch = repstar.get(initiale);
            for (Star e : listsearch){
                System.out.println(e.getName() + "," + e.getBirthday());
            }
        }
        else
        {
            System.out.println(starname + " pas trouvé.");
        }

        // Le nombre de stars, reprises dans le répertoire à une clé donnée, qui sont nées dans les années 60
//        star60rep(repstar);
    }

    private static int star60(Collection<Star> list) {
        Integer cpt = 0;
        Integer annee = 0;

        for (Star s : list) {
            annee = s.getBirthday().getYear();
            if ((annee >= 1960) && (annee < 1970)) {
                cpt++;
            }
        }
        return cpt;
    }

    private static TreeSet creerset1(Collection<Star> inlist) {
        TreeSet<Star> ts = new TreeSet<>(new StarComparatorNameDate());
        ts.addAll(inlist);
        return ts;
    }

    private static TreeSet creerset2(Collection<Star> inlist) {
        TreeSet<Star> ts = new TreeSet<>(new StarComparatorDateName());
        ts.addAll(inlist);
        return ts;
    }

    private static Map creerstarrepertoire(TreeSet<Star> sortedset1) {
        String firstcharactername = " ";
        Map<String, List<Star>> rep = new HashMap<>();
        List<Star> s = new ArrayList<>();

        for (Star p : sortedset1)
        {
//            System.out.println(firstcharactername + ",*" + p.getName() + "*");
            if (p.getName().startsWith(firstcharactername))
            {
                s.add(p);
            }
            else
            {
                if (firstcharactername != " ")
                {
                    rep.put(firstcharactername, s);
                    s = new ArrayList<>();
                    s.add(p);
                }
                firstcharactername = p.getName().substring(0, 1).toUpperCase();
            }
        }
        rep.put(firstcharactername, s);
        return rep;
    }

    private static int star60rep(Map rep) {
        Integer cpt = 0;
        Integer annee = 0;

//        for (Star s : list) {
//            annee = s.getBirthday().getYear();
//            if ((annee >= 1960) && (annee < 1970)) {
//                cpt++;
//            }
//        }
        return cpt;
    }
}

