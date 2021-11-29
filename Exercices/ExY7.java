package package1;

import java.util.Random;
import java.util.Arrays;

public class ExY7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbreinconnues = 3, nbremax = 100;
		double [][] matrice = new double[nbreinconnues][nbreinconnues + 1];
		double operator = 0;
		Random gen = new Random();

		// Chargement de la matrice 
		for (int ligne = 0; ligne < nbreinconnues; ligne++)
		{
			for (int colonne = 0; colonne <= nbreinconnues; colonne++)
			{
				matrice[ligne][colonne] = gen.nextInt(nbremax);
			}
		}
		
		matrice[0][0] = 2;
		matrice[0][1] = 4;
		matrice[0][2] = 1;
		matrice[0][3] = 23;
		matrice[1][0] = 4;
		matrice[1][1] = 1;
		matrice[1][2] = 2;
		matrice[1][3] = 6;
		matrice[2][0] = 1;
		matrice[2][1] = 2;
		matrice[2][2] = -3;
		matrice[2][3] = 1;
		
		System.out.println("Start " + Arrays.deepToString(matrice));

		for (int ligne = 0; ligne < nbreinconnues; ligne++)
		{
			operator = matrice[ligne][ligne];
			for (int colonne = ligne; colonne <= nbreinconnues; colonne++)
			{
				matrice[ligne][colonne] = matrice[ligne][colonne] / operator;
			}

			for (int l2 = ligne +1; l2 < nbreinconnues; l2++)
			{
				operator = matrice[l2][ligne];
				for (int c2 = 0; c2 <= nbreinconnues; c2++)
				{
					matrice[l2][c2] = matrice[l2][c2] - (operator * matrice[ligne][c2]);
				}
			}
		}
		System.out.println("Step 1 " + Arrays.deepToString(matrice));
		
		for (int ligne = nbreinconnues - 1; ligne >= 1; ligne--)
		{
			operator = matrice[ligne - 1][ligne];
			for (int c2 = nbreinconnues; c2 >= 0; c2--)
			{
				matrice[ligne - 1][c2] = matrice[ligne - 1][c2] - (operator * matrice[ligne][c2]);
			}
//			matrice[ligne - 1][nbreinconnues] = matrice[ligne - 1][nbreinconnues] - (operator * matrice[ligne - 1][nbreinconnues]);
		}

		System.out.println("Step 2 " + Arrays.deepToString(matrice));
		for (int ligne = 0; ligne < nbreinconnues; ligne++)
		{
			System.out.println("Inconnue " + (ligne + 1) + " = " + matrice[ligne][nbreinconnues]); 
		}
		
	}
}
