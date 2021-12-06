package constructor;

public class TroisPetitsPoints {
    public static void main(String[] args) {
//        String[] tab = new String[]{"st1", "st2", "st3"};
        String result = concactAnc(new String[]{"st1", "st2", "st3"});

        System.out.println(result);
        result = concactNouv("st1", "st2", "st3");
        System.out.println(result);
    }

    private static String concactAnc(String[] tab) {
        String result = "";
        for (String s : tab) {
            result += s;
        }
        return result;
    }

    private static String concactNouv(String... tab) {
        String result = "";
        for (String s : tab) {
            result += s;
        }
        return result;
    }
}
