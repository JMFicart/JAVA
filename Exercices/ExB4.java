package package1;

import java.util.Scanner;

public class ExB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbre = 1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Entrez un nombre = ");
		nbre = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(nbre + " X " + i + " = " + i * nbre);
		}
		
		sc.close();

	}

}
