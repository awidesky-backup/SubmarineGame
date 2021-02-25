package submarinegame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
	

	public static final int X=15, Y=20; //number of cells for game
	public JCellButton[][] cellBtn = new JCellButton[15][20];
	
	private List<String> shipnames = Arrays.asList(new String[]{"Misury"}); //names of ships
	private MainFrame mainframe;
	private Enemy[] enemy;

	public void init(int enemies) {
		
		for (int i = 0 ; i < 15 ; i++) {
			
			for (int j = 0 ; j < 15 ; j++) {
				
				JCellButton btn = new JCellButton(j,i);
				
				cellBtn[i][j] = btn;
				
			}
			
		}
		
	} //init end
	
	public void newgame(int enemies) {
		
		init(enemies);
		
		int x,y;
		Random ran = new Random();
		enemy = new Enemy[enemies];
		
		for (int i = 0 ; i < enemies ; i++) { enemy[i] = new Enemy(); } //initiate Enemy object in array enemy 
		
		for (int i = 0 ; i < enemies ; i++) {
			
			x = ran.nextInt(13) + 2;
			y = ran.nextInt(18) + 2;
			
		}
		
	}


}
