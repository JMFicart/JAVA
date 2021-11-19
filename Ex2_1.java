package package1;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r;
		
		r = (27 + 3 == 30) && (15 + 2 < 16);
		System.out.println("27 + 3 - 30 et 15 + 2 < 16 = " + r);
		
		r = 27 == 27 || 15 < 2;
		System.out.println("27 = 27 ou 15 < 2 = " + r);
		
		r = 27 == 27 || !(15 < 2);
		System.out.println("27 = 27 ou non (15 < 2) = " + r);

		r = 27 == 27 && !(15 < 2);
		System.out.println("27 = 27 et non (15 < 2) = " + r);

		r = 27 == 28 && 15 < 2 || true;
		System.out.println("27 = 28 et 15 < 2 ou vrai = " + r);
		
		r = 27 == 28 && (15 < 2 || true);
		System.out.println("27 = 28 et (15 < 2 ou vrai) = " + r);
		
		r = 27 == 28 && !(15 < 2) || true; 
		System.out.println("27 = 28 et non (15 < 2) ou vrai = " + r);
		
		r = 27 == 28 && !(15 < 2 || true); 
		System.out.println("27 = 28 et non (15 < 2 ou vrai) = " + r);
		
		r = !(15 - 5 == 12 && true); 
		System.out.println("non (15 - 5 = 12 et vrai) = " + r);
		
		r = !(15 - 5 == 12) && true; 
		System.out.println("non (15 - 5 = 12) et vrai = " + r);
		
		r = !(27 == 28) || !(15 < 2); 
		System.out.println("non (27 = 28) ou non (15 < 2) = " + r);
		
		r = (27 == 27) && !(15 > 2); 
		System.out.println("(27 = 27) et non (15 > 2) = " + r);
		
		r = (27 == 15) || true && false; 
		System.out.println("(27 = 15) ou vrai et faux = " + r);
		
	}

}
