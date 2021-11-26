package package2;

import java.util.Scanner;

public class ExY1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex 1 saisir 10 nombre dans un tableau, affiche le min, le max, la somme, la moyenne
		int[] nombre = new int[10];
		int min = 0, max = 0, somme = 0;
		float moyenne = 0;
		Scanner sc = new Scanner(System.in);

		for (int cpt=0; cpt < 10; cpt++)
		{
			System.out.print("Nombre " + (cpt + 1) + " = ");
			nombre[cpt] = sc.nextInt();
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
		sc.close();

		moyenne = (float) somme / 10.0F;
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Somme = " + somme);
		System.out.println("Moyenne = " + moyenne);
	}
}
