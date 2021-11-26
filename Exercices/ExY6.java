package package2;

import java.util.Random;
import java.util.Arrays;

public class ExY6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex 6 addition, soustraction et multiplication de tableau a double dimention (matrice carrée)
		
		int taille = 2, nbremax = 10;
		int [][] matrice1 = new int[taille][taille];
		int [][] matrice2 = new int[taille][taille];
		int [][] matrice3 = new int[taille][taille];
		Random gen = new Random();

		// Remplissage des matrices
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne < taille; colonne++)
			{
				matrice1[ligne][colonne] = gen.nextInt(nbremax);
				matrice2[ligne][colonne] = gen.nextInt(nbremax);
			}
		}
		// Affichage du contenu des matrices
		System.out.println("Matrice 1");
		System.out.println(Arrays.deepToString(matrice1));
		System.out.println("");
		System.out.println("Matrice 2");
		System.out.println(Arrays.deepToString(matrice2));
		
		// Addition
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne < taille; colonne++)
			{
				matrice3[ligne][colonne] = matrice1[ligne][colonne] + matrice2[ligne][colonne];
			}
		}
		System.out.println("");
		System.out.println("Matrice 3 après addition de Matrice 1 et Matrice 2");
		System.out.println(Arrays.deepToString(matrice3));

		// Soustraction
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne < taille; colonne++)
			{
				matrice3[ligne][colonne] = matrice1[ligne][colonne] - matrice2[ligne][colonne];
			}
		}
		System.out.println("");
		System.out.println("Matrice 3 après soustraction de Matrice 1 et de Matrice 2");
		System.out.println(Arrays.deepToString(matrice3));
		
		// Multiplication
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne < taille; colonne++)
			{
				matrice3[ligne][colonne] = 0;
				for (int ptr = 0; ptr < taille; ptr++)
				{
					matrice3[ligne][colonne] = matrice3[ligne][colonne] + (matrice1[ligne][ptr] * matrice2[ptr][colonne]);	
				}
			}
		}
		// Affichage de la matrice résultat
		System.out.println("");
		System.out.println("Matrice 3 après la multiplication de Matrice 1 par Matrice 2");
		System.out.println(Arrays.deepToString(matrice3));
	}
}
