package package1;

import java.util.Scanner;

public class ExB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee = 1;
		boolean flag = true;
		Scanner sc=new Scanner(System.in);
		
		while (flag == true) {
			System.out.print("Entrez une ann�e = ");
			annee = sc.nextInt();
			if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
				flag = false;
			}
			else
			{
				System.out.println(annee + " n'est pas une ann�e bissextile !");
			}
		}
		
		System.out.println("Ann�e bissextile = " + annee);
		sc.close();
	}
}
