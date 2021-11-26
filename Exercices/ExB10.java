package package1;

import java.util.Scanner;

public class ExB10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cryptage méthode César
		int shift = 3, ascii = 0;
		String phrase = "", phrasecodee = "";
		Scanner sc = new Scanner(System.in);

		shift = shift % 26;
		System.out.print("Entrez une phrase = ");
		phrase = sc.nextLine();
		phrasecodee = "";
		
		for (int i = 0; i < phrase.length(); i++) 
		{
			ascii = phrase.charAt(i);
			
			if (ascii >= 65 && ascii <= 90)
			{
				// Majuscules
				ascii = ascii + shift;
				if (ascii > 90)
				{
					ascii = ascii - 26;
				}
			}
			else
			{
				// Minuscules
				if (ascii >= 97 && ascii <= 122)
				{
					ascii = ascii + shift;
					if (ascii > 122)
					{
						ascii = ascii - 26;
					}
				}
			}
			
			phrasecodee = phrasecodee + Character.toString(ascii);	
		}
		System.out.println("Phrase codée = " + phrasecodee);

		sc.close();
	}
}