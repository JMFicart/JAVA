package package1;

import java.util.Scanner;

public class ExB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbre = 1;
		int r1 = 1, r2 = 2, cpt = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Entrez un nombre = ");
		nbre = sc.nextInt();
		
		for (int i = 1; i <= nbre; i++) {
			r1 = 1;
			r2 = 2;
			
			do {
				System.out.print(r1 + " ");
				cpt = r1 + r2;
				r1 = r2;
				r2 = cpt;
			} while (r1 <= 100);
			System.out.println("");
		}

		sc.close();
	}

}
