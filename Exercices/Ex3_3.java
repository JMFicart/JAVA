package package1;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] coupure = new double[8];
		double montant = 254.38;
		int nbrecoupures;
		
		coupure[0] = 100;
		coupure[1] = 50;
		coupure[2] = 20;
		coupure[3] = 5;
		coupure[4] = 2;
		coupure[5] = 1;
		coupure[6] = 0.5;
		coupure[7] = 0.2;
		
		for (int i = 0 ; i <= 6; i++) {
			nbrecoupures = (int) (montant / coupure[i]);
			System.out.println(i + " " + coupure[i] + " " + nbrecoupures); 
			montant = montant % coupure[i];
			System.out.println(montant);
		}
		nbrecoupures = (int) (montant / coupure[7]);
		nbrecoupures = nbrecoupures + 1;
		System.out.println(7 + " " + coupure[7] + " " + nbrecoupures);
	}

}
