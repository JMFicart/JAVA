package package1;

import java.util.Scanner;

public class ExX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* 4. entre un nombre est dire si il est pair ou impair
		Scanner sc=new Scanner(System.in);
		double nombre = 0.0;

		System.out.println("Entrez un nombre = ");
		nombre = sc.nextDouble();
		
		System.out.println(nombre);
		if ((nombre % 2) == 0) {
			System.out.println("Nombre pair");
			}
		else
			{
			System.out.println("Nombre impair");	
			}

		sc.close();
	}

}
