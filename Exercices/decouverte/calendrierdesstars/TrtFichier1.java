package calendrierdesstars;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TrtFichier1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\studentjava08\\Documents\\Java\\Menus\\java2021-Menu\\src\\collections\\star1.txt");
        String ligne = "";
        String[] morceau = new String[2];
        String birthdate = "";
        String firstname = "";
        String lastname = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date;

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
                if (ligne.contains("&")) {
                    System.out.println("***********" + ligne + "***************");
                }
                morceau = ligne.split(" ");
                firstname = morceau[0];
                if (morceau.length == 1) {
                    lastname = "";
                }
                else
                {
                    lastname = morceau[1];
                }

//                System.out.println(firstname + "," + lastname + "," + date);
//                System.out.println(firstname + "," + lastname);
//                for (String s: ligne.split(" ")) {
//                    System.out.println("*" + s + "*");
//                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("star1.txt n'existe pas !");
        }
    }
}
