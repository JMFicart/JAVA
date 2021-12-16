package calendrierdesstars;

import java.util.Comparator;

public class StarComparatorDateName implements Comparator<Star> {
    @Override
    public int compare(Star s1, Star s2) {
        int i = s1.getBirthday().compareTo(s2.getBirthday());
        if (i==0){
            i = s1.getName().compareTo(s2.getName());
        }
        return i;
    }
}
