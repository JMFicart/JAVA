package package1;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limitebasse = 5, limitehaute = 95, nombre;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez un nombre = ");
		nombre = sc.nextInt();
		
		if (nombre > limitebasse && nombre < limitehaute && nombre != 10) {
			System.out.println(nombre + " est bien compris entre " + limitebasse + " et " + limitehaute + " et est <> 10");
		}
		else {
			System.out.println(nombre + " n'est pas compris entre " + limitebasse + " et " + limitehaute + " ou est = 10");
		}
		sc.close();

	}

}
