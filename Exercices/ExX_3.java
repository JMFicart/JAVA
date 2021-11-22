package package1;

public class ExX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tirage = 0;
		int nbretirages = 100;
		
		for(int i = 1; i <= nbretirages; i++) {
			tirage = Math.random();
			if (tirage < 0.5) {
				System.out.println("Pile");
			}
			else
			{
				System.out.println("Face");	
			}
			
		}
	}

}
