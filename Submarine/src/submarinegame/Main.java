package submarinegame;

import javax.swing.JButton;

public class Main {
	

	public JButton[][] cellBtn;
	

	public void newgame(int enemies) {
		
		cellBtn = new JButton[15][20];
		
		for (int i = 0 ; i < 15 ; i++) {
			
			for (int j = 0 ; j < 15 ; j++) {
				
				JButton btn = new JButton();
				
				btn.addActionListener(e -> {
					
					//check(j,i);
					
				});
				
			}
			
		}
		
		
	}


	private void check(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
