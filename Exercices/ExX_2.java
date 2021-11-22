package package1;

import java.util.Scanner;

public class ExX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee = 1900;
		Scanner sc=new Scanner(System.in);

		System.out.println("Entrez une année = ");
		annee = sc.nextInt();
		
		if (annee % 100 == 0 && annee % 400 != 0) {
			System.out.println("Année non bissextile");
		}
		else
			{
				if (annee % 4 == 0) {
					System.out.println("Année bissextile");
				}
				else
					{
						System.out.println("Année non bissextile");	
					}
			}

		sc.close();

	}

}
