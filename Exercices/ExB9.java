package package1;

import java.util.Scanner;

public class ExB9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = ""; 
		int cpt = 0;
		int ascii = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez une phrase = ");
		phrase = sc.nextLine();
		// 122
		for (int ilettre = 97; ilettre <= 122; ilettre++) 
		{
			cpt = 0;

			for (int i = 0; i < phrase.length(); i++)
			{
				ascii = phrase.charAt(i);

				if (ascii < 97)
				{
					ascii = ascii + 32;
				}

				if (ascii == ilettre)
				{
					cpt++;
				}
				
			}

			System.out.println("Nombre de caract�re " + Character.toString(ilettre) + " = " + cpt);
		}
		sc.close();
	}

}
