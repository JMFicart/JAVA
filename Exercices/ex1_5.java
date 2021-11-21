package package1;

import java.util.Scanner;

public class ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rayon = 0.00F, circonference = 0.00F;
		final float PI = 3.14F;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez le rayon = ");
		rayon = sc.nextFloat();
		circonference = rayon * 2.0F * PI;
		System.out.println("Circonférence = " + circonference);

		sc.close();
	}

}
