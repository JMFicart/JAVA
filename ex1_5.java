package package1;

import java.util.Scanner;

public class ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rayon = 0.00, circonference = 0.00;
		final double PI = Math.PI;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez le rayon = ");
		rayon = sc.nextFloat();
		circonference = rayon * 2.0 * PI;
		System.out.println("Circonférence = " + circonference);

		sc.close();
	}

}
