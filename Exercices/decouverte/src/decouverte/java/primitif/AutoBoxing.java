package decouverte.java.primitif;

public class AutoBoxing {
    public static void main(String[] args) {
        // Boxing
        int i = 5;
        Integer ib = Integer.valueOf(i);

        // Unboxing
        int i2 = ib.intValue();

        // Autoboxing
        Integer box = i;
        int i3 = box;

        Object obj = box;
        obj = i;

        System.out.println(obj.getClass().getName());
    }
}
