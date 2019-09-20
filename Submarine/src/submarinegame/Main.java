package submarinegame;

import java.util.Random;

public class Main {
	

	public JCellButton[][] cellBtn = new JCellButton[15][20];
	

	public void newgame(int enemies) {
		
		
		for (int i = 0 ; i < 15 ; i++) {
			
			for (int j = 0 ; j < 15 ; j++) {
				
				JCellButton btn = new JCellButton(j,i);
				
				cellBtn[i][j] = btn;
				
			}
			
		}
		
		
		int x,y;
		Random ran = new Random();
		Enemy[] enemy = new Enemy[enemies];
		
		for (int i = 0 ; i < enemies ; i++) {
			
			enemy[i] = new Enemy();
			
		}
		
		for (int i = 0 ; i < enemies ; i++) {
			
			x = ran.nextInt(13) + 2;
			y = ran.nextInt(18) + 2;
			
		}
		
	}


}
