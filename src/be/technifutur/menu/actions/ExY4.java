package be.technifutur.menu.actions;

public class ExY4 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ex 4 Ecrire le programme qui initialise les cases de la diagonale principale d�un tableau carr� avec la 
        // valeur 1 et les cases de la diagonale secondaire avec la valeur 2.

		int taillearray = 5;
		int [][] casearray = new int[taillearray][taillearray];
		// Initialiser les diagonales
		for (int ptr = 0; ptr < taillearray; ptr++)
		{
			casearray[taillearray - ptr - 1][ptr] = 2;
			casearray[ptr][ptr] = 1;
			if (taillearray - ptr - 1 == ptr)
			{
				casearray[ptr][ptr] = 3;	
			}
		}
		// Afficher la matrice
		for (int ligne = 0; ligne < taillearray; ligne++)
		{
			for (int colonne = 0; colonne < taillearray; colonne++)
			{
				System.out.print(casearray[ligne][colonne] + " ");
			}
			System.out.println("");
		}
	}
}
