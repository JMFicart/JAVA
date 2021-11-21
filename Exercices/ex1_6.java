package package1;

import java.util.Scanner;

public class ex1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1 = 0.00F, n2 = 0.00F, n3 = 0.00F;
		float moyenne = 0.00F;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez le premier nombre = ");
		n1 = sc.nextFloat();
		System.out.println("Entrez le deuxième nombre = ");
		n2 = sc.nextFloat();
		System.out.println("Entrez le troisième nombre = ");
		n3 = sc.nextFloat();
		
		moyenne = (n1+n2+n3)/3.00F;
		
		System.out.println("Moyenne = " + moyenne);
		sc.close();
	}

}
