package unneed;

@Deprecated
public class Rader {

	public static String[][] rader = {{"A0","B0","C0","D0","E0","F0","G0","H0","I0","J0"} , 
			   {"A1","B1","C1","D1","E1","F1","G1","H1","I1","J1"} ,
			   {"A2","B2","C2","D2","E2","F2","G2","H2","I2","J2"} ,
			   {"A3","B3","C3","D3","E3","F3","G3","H3","I3","J3"} ,
			   {"A4","B4","C4","D4","E4","F4","G4","H4","I4","J4"} ,
			   {"A5","B5","C5","D5","E5","F5","G5","H5","I5","J5"} ,
};
	
	public static String[][] racor = {{"A0","B0","C0","D0","E0","F0","G0","H0","I0","J0"} , 
			   {"A1","B1","C1","D1","E1","F1","G1","H1","I1","J1"} ,
			   {"A2","B2","C2","D2","E2","F2","G2","H2","I2","J2"} ,
			   {"A3","B3","C3","D3","E3","F3","G3","H3","I3","J3"} ,
			   {"A4","B4","C4","D4","E4","F4","G4","H4","I4","J4"} ,
			   {"A5","B5","C5","D5","E5","F5","G5","H5","I5","J5"} ,
};
	
	public static void reset() {
		
		int j;
		for (int i = 0;i < 9;i++) {
			
			for (j = 0; j < 5; j++) {
				
				rader[i][j] = racor[i][j];
				
			}
				
		}
			
}
		
	
	
	public static void attempt(String c , String whether) {
		int j;
		label:
		for (int i = 0;i < 9;i++) {
			
			for (j = 0; j < 5; j++) {
				
				if (rader[i][j] == c) {
					rader[i][j] = whether;
					break label;
				}
				
			}
			
		}
		
	}
}
