package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithRessource {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\studentjava08\\Documents\\Java\\Menus\\java2021-Menu\\src\\Exceptions\\toto.txt");
        try (Scanner scan = new Scanner(f)) {
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("toto.txt n'existe pas !");
        }
    }
}
