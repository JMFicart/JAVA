package package1;

import java.util.Random;

public class ExB7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hauteur = 20; 
		String ligne = "";
		Random rand= new Random();

		// Tracer le cône
		for (int i = 1; i <= hauteur; i++)
		{
			ligne = "";
			for (int j = 1; j < (hauteur - i + 1); j++)
			{
				ligne = ligne + " ";
			}
			
			for (int j = 1; j <= ((i- 1) * 2) - 1; j++)
			{
				// Procédure de sélection d'un caractère de remplissage aléatoire
                switch (rand.nextInt(10)) {
                case 1:
                    ligne = ligne + "%";
                    break;
//                case 2:
//                    ligne = ligne + "§";
//                    break;
                case 3 : 
                    ligne = ligne + "#";
                    break;
//                case 4 : 
//                    ligne = ligne + "#";
//                    break;
                case 5:
                    ligne = ligne + "%";
                    break;
                case 7 : 
                    ligne = ligne + "@";
                    break;    
                case 9 : 
                    ligne = ligne + "&";
                    break;
                default: ligne = ligne + "*";
                    break;
                }
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