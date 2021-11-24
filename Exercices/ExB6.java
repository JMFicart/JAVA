package package1;

public class ExB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longueur = 40, nbrelignes = 13;
		
		for (int cptligne = 1; cptligne <= nbrelignes; cptligne++) 
		{
			for (int i = 1; i <= longueur; i++)
			{
				if (cptligne <= 7)
				{
					if (i < 18)
					{
						// Carré bleu étoilé
						System.out.print("*");
					}
					else
					{
						if (cptligne % 2 != 0)
						{
							// Ligne rouge
							System.out.print("#");
						}
					}
				}
				else
				{
					if (cptligne % 2 != 0)
					{
						// Ligne rouge
						System.out.print("#");
					}
				}
			}
			System.out.println("");
		}
		
	}

}
