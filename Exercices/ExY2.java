package package2;

public class ExY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex 2 Ecrire un programme qui permet de tester la présence d'une valeur textuelle dans un tableau prédéfini.
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
				System.out.println("La chaîne " + valeurtextuelle + " a été touvée !");
				flag = false;
			}
			else
			{
				ptrarray++;
			}
		}
		if (flag==true)
		{
			System.out.println("La chaîne " + valeurtextuelle + " n'a pas été touvée !");	
		}
	}
}
