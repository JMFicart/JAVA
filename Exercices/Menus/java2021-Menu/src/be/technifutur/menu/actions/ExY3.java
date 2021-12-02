package be.technifutur.menu.actions;

import java.util.Scanner;
import java.util.Random;

public class ExY3 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
        // ex 3 remplir un tableau de 10 element de valeur aleatoire de 1 a 100, puis le trie 
		// et puis faire un jeu du +- pour retrouve tout les element de ce tableau 
        //         si il a un nombre a un intervalle - de 5 affiche proche
        //         a la fin marche le nombre de fois ou il a saisi une valeur et le nombre de vois ou 
		//		   il a du mettre pour chaque element
        //         [10,15,20,45,62....]
        //         saisi 33
        //         affichage inferieur,inferieur, inferieur ,superieur , superieur ....
        //         saisi 22
        //         affichage inferieur,inferieur, proche ,superieur , superieur ....
		
		Scanner sc1=new Scanner(System.in);
		int taillearray = 10, nbremax = 100;
		int echange = 0, entree = 0, nbretrouve = 0, cpt = 0;
		int [] intarray = new int[taillearray];
		boolean [] boltrouve = new boolean[taillearray];
		String ligne = "";
		Random gen = new Random();

		// Remplissage du tableau
		for (int ptr = 0; ptr < taillearray; ptr++)
		{
			intarray[ptr] = gen.nextInt(nbremax);
			boltrouve[ptr] = false;
		}
		
		// Tri du tableau
		for (int ptr1 = 0; ptr1 < (taillearray - 1); ptr1++)
		{
			for (int ptr2 = ptr1 + 1; ptr2 < taillearray; ptr2++)
			{
				if (intarray[ptr1] > intarray[ptr2])
				{
					echange = intarray[ptr1];
					intarray[ptr1] = intarray[ptr2];
					intarray[ptr2] = echange;
				}
			}
//			System.out.print(intarray[ptr1] + " ");
		}
//		System.out.println(intarray[taillearray - 1]);
		
		// Traitement
		while (nbretrouve < taillearray)
		{
			// Saisie du nombre
			System.out.print("Entrez un nombre = ");
			entree = sc1.nextInt();
			cpt++;
			
			// Recherche du r�sultat
			ligne = "";
			for (int ptr = 0; ptr < taillearray; ptr++)
			{
				if (boltrouve[ptr] == true)
				{
					ligne = ligne + intarray[ptr] + " Trouv� ";
				}
				else
				{
					if ((Math.abs(intarray[ptr] - entree) > 0) && (Math.abs(intarray[ptr] - entree) < 5))
					{
						ligne = ligne + "Proche ";
					}
				else
					{
						if (intarray[ptr] < entree)
						{
							ligne = ligne + "Inf�rieur ";
						}
						else
						{
							if (intarray[ptr] == entree)
							{
								ligne = ligne + intarray[ptr] + " Trouv� ";
								boltrouve[ptr] = true;
							}
							else
							{
								ligne = ligne + "Sup�rieur ";
							}
						}
					}
				}
			}
			System.out.println(ligne);
			
			// V�rification du nombre d'�l�ments trouv�s
			nbretrouve = 0;
			for (int ptr = 0; ptr < taillearray; ptr++)
			{
				if (boltrouve[ptr] == true)
				{
					nbretrouve++;
				}
			}
		}
		//sc1.close();
		System.out.println("Nombre de tentatives n�cessaires = " + cpt);
	}
}
