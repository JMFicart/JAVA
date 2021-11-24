package package1;

import java.util.Scanner;

public class ExB4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbre = 1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Entrez un nombre = ");
		nbre = sc.nextInt();
		
		for (int j = 1; j <= nbre; j ++) {
			for (int i = 1; i <= nbre; i++) {
				System.out.println(j + " X " + i + " = " + i * j);
			}
		}
		sc.close();

	}

}
