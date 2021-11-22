package package1;

public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a, b;
		int age;
		
		age = 25;
		a = true;
		b = false;
		
		if ((age < 6) || (age < 12 && b ==true) || (age > 12 && a == true)){
			System.out.println("Accès OK");
			}
		else
			{
				System.out.println("Pas d'accès");
			}
	}

}
