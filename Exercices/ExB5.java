package package1;

import java.util.Random; 

public class ExB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gagne = new int [3][3];
		int[] score = new int [] {0, 0};
		String [] round = new String [] {"Pierre","Papier","Ciseaux"};
		int round1 = 0, round2 = 0;
		Random gen = new Random();
	
		// ligne = joueur 1, colonne joueur 2
		// ligne 1 : pierre
		gagne[0][0] = -1; // Match null
		gagne[0][1] = 2; // joueur 2 gagne
		gagne[0][2] = 1; // joueur 1 Gagne
		// ligne 2 : papier
		gagne[1][0] = 1; // joueur 1 Gagne
		gagne[1][1] = -1; // Match null
		gagne[1][2] = 2; // joueur 2 gagne
		// ligne 3 : ciseaux
		gagne[2][0] = 2; // joueur 2 Perd
		gagne[2][1] = 1; // joueur 1 Gagne
		gagne[2][2] = -1; // Match null
		
		while (score[0] < 3 && score[1] < 3)
			{
				round1 = gen.nextInt(3);
				round2 = gen.nextInt(3);

				System.out.println("Joueur 1 (" + score[0] + ") = " + round[round1] + "  Joueur 2 (" + score[1] + ") = " + round[round2]);
				
				switch (gagne[round1][round2]) {
				case -1:
					System.out.println("Match nul !");
					break;
				default:
					System.out.println("Point pour Joueur " + gagne[round1][round2]);
					score[gagne[round1][round2] - 1]++;
					break;
				}
			}
		if (score[0] == 3) 
			{
				System.out.println("Joueur 1 gagnant !");
			}
		else
			{
				System.out.println("Joueur 2 gagnant !");
			}
		
	}

}
