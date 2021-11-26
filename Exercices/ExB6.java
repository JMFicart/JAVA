package package1;

public class ExB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longueur = 48, nbrelignes = 13;
		String ligne = "";
		
		for (int cptligne = 1; cptligne <= nbrelignes; cptligne++) 
		{
			ligne = "";

			if (cptligne <= 7)
			{
				for(int i = 1; i <= 10; i++)
				{
					// Carré bleu étoilé
					ligne = ligne + "* ";
				}
				
				while (ligne.length() < longueur)
				{
					if (cptligne % 2 != 0)
					{
						// Ligne rouge
						ligne = ligne + "#";
					}
					else
					{
						// Ligne blanche
						ligne = ligne + " ";
					}
				}
			}
			else
			{
				while (ligne.length() < longueur)
				{
					if (cptligne % 2 != 0)
					{
						// Ligne rouge
						ligne = ligne + "#";
					}
					else
					{
						// Ligne blanche
						ligne = ligne + " ";
					}
				}
			}
			System.out.println(ligne);
		}
		
	}

}