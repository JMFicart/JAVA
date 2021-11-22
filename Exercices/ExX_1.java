package package1;

import java.util.Scanner;

public class ExX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int jour = 0;

		System.out.println("Entrez un nombre entre 1 et 7 = ");
		jour = sc.nextInt();
		
		switch (jour) {
		case 1:
			System.out.println("Lundi");
			break;
		case 2:
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("Jeudi");
			break;
		case 5:
			System.out.println("Vendredi");
			break;
		case 6:
			System.out.println("Samedi");
			break;
		case 7:
			System.out.println("Dimanche");
			break;
		default:
			System.out.println("Mauvaise entrée");
		}
		
		sc.close();

	}

}
