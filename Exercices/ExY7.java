package package2;

import java.util.Random;
import java.util.Arrays;

public class ExY7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Résolution d'un système d'équation à X inconnues
		int taille = 2, nbremax = 100;
		double [][] matrice = new double[taille][taille + 1];
		Random gen = new Random();

		// Chargement de la matrice 
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for (int colonne = 0; colonne <= taille; colonne++)
			{
				matrice[ligne][colonne] = gen.nextInt(nbremax);
			}
		}
		
		matrice[0][0] = 2;
		matrice[0][1] = 1;
		matrice[0][2] = 11;
		matrice[1][0] = 3;
		matrice[1][1] = 5;
		matrice[1][2] = 27;
		
		System.out.println(Arrays.deepToString(matrice));

		for (int ligne = 0; ligne < taille - 1; ligne++)
		{
			for (int colonne = ligne; colonne <= taille; colonne++)
			{
				matrice[ligne][colonne] = matrice[ligne][colonne] / matrice[ligne][ligne];
			}

			for (int l2 = ligne +1; l2 < taille; l2++)
			{
				for (int c2 = ligne; c2 <= taille; c2++)
				{
					matrice[l2][c2] = matrice[l2][c2];
				}
			}
		}
	}

}
