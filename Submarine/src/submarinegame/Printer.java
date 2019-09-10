package submarinegame;

import static submarinegame.Rader.rader;

@Deprecated
public class Printer {

	public static void print(boolean divided) {
		
		String endline = "---------------------------------------------";
		String middleline;
		String wall;
		
		if (divided) {
			
			middleline = endline + "\n";
			wall = "|";
			
		} else {
			
			middleline = "";
			wall = " ";
			
		}
		
		
		StringBuilder line = new StringBuilder();
		
		for (int i = 0;i < 9;i++) {
			
			System.out.println(endline);
			line.append(wall);
			
			for (int j = 0; j < 5; j++) {
				
				line.append(rader[i][j] + wall);
				
			}
			
			line.append("/n" + middleline);
			System.out.print(line);
			line = new StringBuilder();
			
		}
			
		System.out.println(endline);
		
	}
}
