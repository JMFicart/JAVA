package collections;

import java.util.Comparator;

public class BirthdayNameFirstnamePersonneComparator implements Comparator<Personne>{
    @Override
    public int compare(Personne o1, Personne o2) {
        int i = o1.getBirthday().compareTo(o2.getBirthday());
        if (i==0){
            i = o1.getFirstname().compareTo(o2.getFirstname());
            if (i==0){
                i = o1.getName().compareTo(o2.getName());
            }
        }
        return i;
    }
}
