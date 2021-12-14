package Exceptions;

public class Decouverte {
    public static void main(String[] args) {
        System.out.println("Decouverte.main début");
        fct1(14);
        System.out.println("Decouverte.main fin");
    }

    private static void fct1(int i) {
        System.out.println("Decouverte.fct1 début");
        try {
            System.out.println("Decouverte.fct1 début try");
            fct2(i);
            System.out.println("Decouverte.fct1 fin try");
        } catch (IllegalArgumentException | PresqueValideException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        catch (PresqueValideException e) {
//            System.out.println(e.getMessage());
//        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Decouverte.fct1 fin");
    }

    private static void fct2(int i) throws PresqueValideException {
        System.out.println("Decouverte.fct2 début");
        fct3(i);
        System.out.println("Decouverte.fct2 fin");
    }

    private static void fct3(int i) throws PresqueValideException {
        System.out.println("Decouverte.fct3 début");
        if (i < 10) {
            throw new IllegalArgumentException(String.format("La valeur %s est non valide", i));
        }
        if (i < 15) {
            throw new PresqueValideException("presque");
        }

//        String a = null;
//        System.out.println(a.length());
//        System.out.println("Valeur : " + i);
    }
}
