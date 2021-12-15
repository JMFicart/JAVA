package calendrierdesstars;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TrtFichier1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\studentjava08\\Documents\\Java\\Menus\\java2021-Menu\\src\\collections\\star1.txt");
        String ligne = "";
        String[] morceau = new String[2];
        String birthdate = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date;
        Star star;
        ArrayList<Star> starlist = new ArrayList<Star>();

        try (Scanner scan = new Scanner(f)) {
            while (scan.hasNext()) {
                ligne = scan.nextLine();
                morceau = ligne.split(" : ");
                birthdate = morceau[0].trim();

                if (birthdate.charAt(1) == 'e') {
                    birthdate = "1" + birthdate.substring(3);
                }
                date = LocalDate.parse(birthdate, formatter);

                ligne = morceau[1];
                morceau = ligne.split(" & ");
                for (String name : morceau)
                    {
                        star = new Star(name.trim(),date);
                        starlist.add(star);
                    }
            }
            for (Star s : starlist)
            {
                System.out.println(s.getName() + ", " + s.getBirthday());
            }
        } catch (FileNotFoundException e) {
            System.out.println("star1.txt n'existe pas !");
        }
    }
}
