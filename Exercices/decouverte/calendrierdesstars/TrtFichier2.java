package calendrierdesstars;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TrtFichier2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\studentjava08\\Documents\\Java\\Menus\\java2021-Menu\\src\\collections\\star2.txt");
        String ligne = "";
        String[] morceau = new String[2];
        String birthdate = "";
        String namejob = "";
        LocalDate date;
        Integer i = 0;
        Boolean flag;
        Star star;
        ArrayList<Star> starlist = new ArrayList<Star>();

        try (Scanner scan = new Scanner(f)) {
            while (scan.hasNext()) {
                ligne = scan.nextLine();
                morceau = ligne.split(" : ");

                if (morceau.length == 2)
                {
                    namejob = morceau[0].trim();
                    birthdate = morceau[1].trim();
                    // Traitement du nom
                    morceau = namejob.split(" \\(");
                    namejob = morceau[0];
                    // Traitement de la date
                    date = ConversionDate(birthdate);

                    star = new Star(namejob,date);
                    starlist.add(star);
                    System.out.println(namejob + "," + date);
                }
            }
            for(Star s: starlist) {
                System.out.println(s.getName() + ", " + s.getBirthday());
            }
        } catch (FileNotFoundException e) {
            System.out.println("star2.txt n'existe pas !");
        }
    }

    private static LocalDate ConversionDate(String birthdate)
    {
        Integer i = 0;
        Boolean flag;
        String[] trtdate = new String[15];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date;

        trtdate = birthdate.split(" ");
        birthdate = "";
        i = 0;
        flag = false;
        for (int j = 0; flag == false;j++)
        {
            if (trtdate[j].length() > 0)
            {
                birthdate = birthdate + trtdate[j] + " ";
                i++;
                if (i == 3)
                {
                    birthdate = birthdate.trim();
                    flag = true;
                }
            }
        }
        birthdate = birthdate.replace(",","");
        birthdate = birthdate.replace("1er","1");
        birthdate = birthdate.replace(")","");

        birthdate = birthdate.toLowerCase();
        birthdate = birthdate.replace("fevrier","février");
        birthdate = birthdate.replace("aout","août");
        birthdate = birthdate.replace("decembre","décembre");
        date = LocalDate.parse(birthdate, formatter);

        return  date;
    }
}
