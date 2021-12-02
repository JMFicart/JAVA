package be.technifutur.menu.actions;

public class ExY2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ex 2 Ecrire un programme qui permet de tester la pr�sence d'une valeur textuelle dans un tableau pr�d�fini.
		int ptrarray = 0, longueurarray = 6;
		String [] textarray = new String[longueurarray];
		String valeurtextuelle = "";
		boolean flag = true;

		// Chargement du tableau
		textarray[0] = "Pomme";
		textarray[1] = "Poire";
		textarray[2] = "Prune";
		textarray[3] = "Cerise";
		textarray[4] = "Orange";
		textarray[5] = "Banane";
		valeurtextuelle = "Orange";

		ptrarray = 0; 
		while ((flag == true) && (ptrarray < textarray.length))
		{
			if (textarray[ptrarray] == valeurtextuelle)
			{
				System.out.println("La cha�ne " + valeurtextuelle + " a �t� touv�e !");
				flag = false;
			}
			else
			{
				ptrarray++;
			}
		}
		if (flag==true)
		{
			System.out.println("La cha�ne " + valeurtextuelle + " n'a pas �t� touv�e !");	
		}
	}
}
