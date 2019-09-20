package submarinegame;

import java.util.ArrayList;

@Deprecated
public class Coodinatesetter {
	
	public static String[][] coor = {{"A0","B0","C0","D0","E0","F0","G0","H0","I0","J0"} , 
			   {"A1","B1","C1","D1","E1","F1","G1","H1","I1","J1"} ,
			   {"A2","B2","C2","D2","E2","F2","G2","H2","I2","J2"} ,
			   {"A3","B3","C3","D3","E3","F3","G3","H3","I3","J3"} ,
			   {"A4","B4","C4","D4","E4","F4","G4","H4","I4","J4"} ,
			   {"A5","B5","C5","D5","E5","F5","G5","H5","I5","J5"} ,
	};

	public static void get(ArrayList<String> re) {
		
		int x;
		int y;
		
		Lable:
			
		for (;;) {
		
		x = (int)Math.random() * 9;
		y = (int)Math.random() * 5;
		
		if (Math.random() * 1 == 0) {
			
			if (coor[x][y] != "0" && coor[x][y+1] != "0" && coor[x][y-1] != "0") {
				
				re.add(coor[x][y]);
				re.add(coor[x][y+1]);
				re.add(coor[x][y-1]);
				
				coor[x][y] = "0";
				coor[x][y+1] = "0";
				coor[x][y-1] = "0";
			
			} 
			
		} else {
			
			if (coor[x][y] != "0" && coor[x+1][y] != "0" && coor[x-1][y] != "0") {
				
				re.add(coor[x][y]);
				re.add(coor[x+1][y]);
				re.add(coor[x-1][y]);
				
				coor[x][y] = "0";
				coor[x+1][y] = "0";
				coor[x-1][y] = "0";
			
			} else {
				
				break Lable;
				
			}
		}	
		}
	}
	
	public static String[][] raco = {{"A0","B0","C0","D0","E0","F0","G0","H0","I0","J0"} , 
			   {"A1","B1","C1","D1","E1","F1","G1","H1","I1","J1"} ,
			   {"A2","B2","C2","D2","E2","F2","G2","H2","I2","J2"} ,
			   {"A3","B3","C3","D3","E3","F3","G3","H3","I3","J3"} ,
			   {"A4","B4","C4","D4","E4","F4","G4","H4","I4","J4"} ,
			   {"A5","B5","C5","D5","E5","F5","G5","H5","I5","J5"} ,
};
	
	public static void reset() {
		
		for (int i = 0;i < 9;i++) {
			
			for (int j = 0; j < 5; j++) {
				
				coor[i][j] = raco[i][j];
				
			}
				
		}
			
}
}
