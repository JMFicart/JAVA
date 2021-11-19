package package1;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limitebasse = 7, limitehaute = 77, age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez votre âge = ");
		age = sc.nextInt();
		
		if (age >= limitebasse && age <= limitehaute) {
			System.out.println(age + " est bien compris entre " + limitebasse + " et " + limitehaute);
		}
		else {
			System.out.println(age + " n'est pas compris entre " + limitebasse + " et " + limitehaute);
		}
		sc.close();
	}

}
