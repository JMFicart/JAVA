package package1;

import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 0.00F, b = 0.00F;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez la valeur A = ");
		a = sc.nextFloat();
		
		System.out.println("Entrez la valeur B = ");
		b = sc.nextFloat();
		
		if (a == 0) {
				if (b == 0)	{
						System.out.println("Equation indéterminée !");
					}
				else
					{
						System.out.println("Equation impossible !");						
					}
			} 
		else
			{
				System.out.println(a + "x + " + b + " = 0" );
				System.out.println("x = " + -b/a);
			}
		sc.close();
				
	}

}
