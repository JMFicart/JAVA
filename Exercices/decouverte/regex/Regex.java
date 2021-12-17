package regex;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une date au format d/m/yyyy : ");

        if(sc.nextLine().matches("([1-2][0-9]?|3[01]?|[4-9])\\/(1[0-2]?|[2-9])\\/([1-9]\\d{3})"))
            System.out.println("C'est bon");
        else
            System.out.println("C'est pas bon");

    }
}
