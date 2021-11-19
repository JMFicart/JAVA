package package1;

public class ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5, z = 1, echange;
		
		System.out.println("x = " + x + "  y = " + y + "  z = " + z);

		echange = x;
		x = y;
		y = z;
		z = echange;

		System.out.println("x = " + x + "  y = " + y + "  z = " + z);

	}

}
