package package2;

import java.util.Random;

public class ExY5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ecrire le programme qui affiche la moyenne le maximum et le minimum de chaque ligne et cologone d’un 
        // tableau à deux dimensions
		int taille = 20, nbremax = 10;
		int [][] intarray = new int[taille][taille];
		int [] mincol = new int[taille];
		int [] maxcol = new int[taille];
		int [] minligne = new int[taille];
		int [] maxligne = new int[taille];
		int [] moycol = new int[taille];
		int [] moyligne = new int[taille];
		Random gen = new Random();

		// Remplissage et affichage de la matrice
		System.out.println("Matrice");
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne < taille; colonne++)
			{
				intarray[ligne][colonne] = gen.nextInt(nbremax);
				System.out.print(intarray[ligne][colonne] + " ");
			}
			System.out.println("");
		}
		System.out.println("");

		// Traitement
		for (int ptrligne = 0; ptrligne < taille; ptrligne++)
		{
			for (int ptrcolonne = 0; ptrcolonne < taille; ptrcolonne++)
			{
				moycol[ptrcolonne] = moycol[ptrcolonne] + intarray[ptrligne][ptrcolonne];
				moyligne[ptrligne] = moyligne[ptrligne] + intarray[ptrligne][ptrcolonne];
			
				if (ptrligne > 0)
				{
					if (mincol[ptrcolonne] > intarray[ptrligne][ptrcolonne]) 
					{
						mincol[ptrcolonne] = intarray[ptrligne][ptrcolonne];	
					}
					else if (maxcol[ptrcolonne] < intarray[ptrligne][ptrcolonne])
					{
						maxcol[ptrcolonne] = intarray[ptrligne][ptrcolonne];
					}
				}
				else
				{
					mincol[ptrcolonne] = intarray[ptrligne][ptrcolonne];
					maxcol[ptrcolonne] = intarray[ptrligne][ptrcolonne];
				}
				
				if (ptrcolonne > 0)
				{
					if (minligne[ptrligne] > intarray[ptrligne][ptrcolonne]) 
					{
						minligne[ptrligne] = intarray[ptrligne][ptrcolonne];	
					}
					else if (maxligne[ptrligne] < intarray[ptrligne][ptrcolonne])
					{
						maxligne[ptrligne] = intarray[ptrligne][ptrcolonne];
					}
				}
				else
				{
					minligne[ptrligne] = intarray[ptrligne][ptrcolonne];
					maxligne[ptrligne] = intarray[ptrligne][ptrcolonne];
				}
			}
		}
		
		// Affichage des résultats
		for (int ptrligne = 0; ptrligne < taille; ptrligne ++)
		{
			System.out.println("Minimum pour la ligne " + (ptrligne + 1) + " = " + minligne[ptrligne]);
		}
		
		for (int ptrligne = 0; ptrligne < taille; ptrligne ++)
		{
			System.out.println("Maximum pour la ligne " + (ptrligne + 1) + " = " + maxligne[ptrligne]);
		}
		
		for (int ptrligne = 0; ptrligne < taille; ptrligne ++)
		{
			System.out.println("Moyenne pour la ligne " + (ptrligne + 1) + " = " + ((float) moyligne[ptrligne] / (float) taille));
		}
		
		for (int ptrcolonne = 0; ptrcolonne < taille; ptrcolonne ++)
		{
			System.out.println("Minimum pour la colonne " + (ptrcolonne + 1) + " = " + mincol[ptrcolonne]);
		}
		
		for (int ptrcolonne = 0; ptrcolonne < taille; ptrcolonne ++)
		{
			System.out.println("Maximum pour la colonne " + (ptrcolonne + 1) + " = " + maxcol[ptrcolonne]);
		}
		
		for (int ptrcolonne = 0; ptrcolonne < taille; ptrcolonne ++)
		{
			System.out.println("Moyenne pour la colonne " + (ptrcolonne + 1) + " = " + ((float) moycol[ptrcolonne] / (float) taille));
		}
	}
}
