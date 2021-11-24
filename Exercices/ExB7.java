package package1;

public class ExB7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hauteur = 10; 
		String ligne = "";

		// Tracer le cone
		for (int i = 1; i <= hauteur; i++)
		{
			ligne = "";
			for (int j = 1; j < (hauteur - i + 1); j++)
			{
				ligne = ligne + " ";
			}
			
			for (int j = 1; j <= ((i- 1) * 2) - 1; j++)
			{
				ligne = ligne + "*";
			}
			System.out.println(ligne);
		}

		// Tracer le tronc
		ligne = "";
		for (int j = 1; j < (hauteur - 1); j++)
		{
			ligne = ligne + " ";
		}
		ligne = ligne + "*"; 
		
		for (int j = 1; j <= 2; j++)
		{
			System.out.println(ligne);
		}
	}

}
