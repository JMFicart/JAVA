package package1;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
//		int i = 0, j =0;
		//1
		s = String.valueOf(((27 + 3) == 30) && ((15 + 2) < 16));
		System.out.println("27 + 3 = 30 et 15 + 2 < 16 = " + s);
		//2
		s = String.valueOf(((27 == 27) || (15 < 2)));
		System.out.println("27 = 27 ou 15 < 2 = " + s);
		//3
		s = String.valueOf(((27 == 27) || !(15 < 2)));
		System.out.println("27 = 27 ou non (15 < 2) = " + s);
		//4
		s = String.valueOf(((27 == 28) && !(15 < 2)));
		System.out.println("27 = 28 et non (15 < 2) = " + s);
		//5
		s = String.valueOf(((27 == 27) && (15 < 2) || true));
		System.out.println("27 = 27 et 15 < 2 ou vrai = " + s);
		//6
		s = String.valueOf((27 == 28 && (15 < 2 || true)));
		System.out.println("27 = 28 et (15 < 2 ou vrai) = " + s);
		//7		
		s = String.valueOf((27 == 28 && !(15 < 2) || true));
		System.out.println("27 = 28 et (15 < 2) ou vrai = " + s);
		//8
		s = String.valueOf((27 == 28 && !(15 < 2 || true)));
		System.out.println("27 = 28 et non (15 < 2 ou vrai) = " + s);
		//9
		s = String.valueOf(!(15 - 5 == 12 && true));
		System.out.println("non (15 - 5 = 12 et vrai) = " + s);
		//10
		s = String.valueOf(!(15 - 5 == 12) && true);
		System.out.println("non (15 - 5 = 12) et vrai = " + s);
		//11
		s = String.valueOf(!(27 == 28) || !(15 < 2));
		System.out.println("non (27 = 28) ou non (15 < 2) = " + s);
		//12
		s = String.valueOf(27 == 27 && !(15 > 2));
		System.out.println("27 = 27 et non (15 > 2) = " + s);
		//13
		s = String.valueOf(27 == 15 || true && false);
		System.out.println("27 = 15 ou vrai et faux = " + s);
		
		
		//		j = 5;
//		i = j++;
//		System.out.println(i);
//		System.out.println(j);
//		i = ++j;
//		System.out.println(i);
//		System.out.println(j);
	}

}
