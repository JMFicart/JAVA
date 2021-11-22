package package1;

public class Ex2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee = 1900;

//		System.out.println(annee % 100);
//		System.out.println(annee % 400);
//		System.out.println(annee % 4);
		
		if (annee % 100 == 0 && annee % 400 != 0) {
			System.out.println("Année non bissextile");
		}
		else
			{
				if (annee % 4 == 0) {
					System.out.println("Année bissextile");
				}
				else
					{
						System.out.println("Année non bissextile");	
					}
			}
	}

}
