package package1;

public class ExX_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1 = "22/11/2021";
		String date2 = "24/11/2021";
		int annee1, mois1, jour1;
		int annee2, mois2, jour2;
		int jour;
		int nbrejours = 0;
		int[] nbrejoursmois = new int[12];
		
		nbrejoursmois[0] = 31;
		nbrejoursmois[1] = 28;
		nbrejoursmois[2] = 31;
		nbrejoursmois[3] = 30;
		nbrejoursmois[4] = 31;
		nbrejoursmois[5] = 30;
		nbrejoursmois[6] = 31;
		nbrejoursmois[7] = 31;
		nbrejoursmois[8] = 30;
		nbrejoursmois[9] = 31;
		nbrejoursmois[10] = 30;
		nbrejoursmois[11] = 31;

		jour1 = Integer.parseInt((String) date1.subSequence(0, 2));
		mois1 = Integer.parseInt((String) date1.subSequence(3, 5));
		annee1 = Integer.parseInt((String) date1.subSequence(6, 10));

		jour2 = Integer.parseInt((String) date2.subSequence(0, 2));
		mois2 = Integer.parseInt((String) date2.subSequence(3, 5));
		annee2 = Integer.parseInt((String) date2.subSequence(6, 10));
		
		if (annee1 == annee2) 
			{
				nbrejours = nbrejoursmois[mois1 - 1] - jour1 + 1;
				if (annee1 % 4 == 0 && mois1 == 2)
					{
						nbrejours++;
					}
				for (int mois = mois1 - 1; mois < mois2 - 1;mois++)
					{
						nbrejours = nbrejours + nbrejoursmois[mois];
						if (annee1 % 4 == 0 && mois == 2)
						{
							nbrejours++;
						}
					}
			}
		else
			{
				
			}
			
		System.out.println(annee1);
		System.out.println(annee2);
	}

}
