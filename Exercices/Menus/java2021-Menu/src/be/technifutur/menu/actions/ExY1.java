package be.technifutur.menu.actions;

import java.util.Scanner;

public class ExY1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ex 1 saisir 5 nombre dans un tableau, affiche le min, le max, la somme, la moyenne
		int min = 0, max = 0, somme = 0, taille = 5;
		int[] nombre = new int[taille];
		float moyenne = 0;
		Scanner sc1 = new Scanner(System.in);

		for (int cpt=0; cpt < taille; cpt++)
		{
			System.out.print("Nombre " + (cpt + 1) + " = ");
			nombre[cpt] = sc1.nextInt();
			somme = somme + nombre[cpt];
			if (cpt == 0)
			{
				min = nombre[cpt];
				max = nombre[cpt];
			}
			else
			{
				if (nombre[cpt] < min)
				{
					min = nombre[cpt];
				}
				else
				{
					if (nombre[cpt] > max)
					{
						max = nombre[cpt];
					}
				}
			}
		}
		//sc1.close();

		moyenne = (float) somme / (float) taille;
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Somme = " + somme);
		System.out.println("Moyenne = " + moyenne);
	}
}
