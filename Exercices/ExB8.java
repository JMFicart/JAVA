package package1;

import java.util.Scanner;

public class ExB8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "";
		String phrasechangee = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez une phrase = ");
		phrase = sc.nextLine();
		
		phrasechangee = "";
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == ' ')
			{
				phrasechangee = phrasechangee + "|";
			}
			else
			{
				phrasechangee = phrasechangee + phrase.charAt(i);
			}
		}
		System.out.println("Phrase transformée = " + phrasechangee);
		
		sc.close();
	}

}
