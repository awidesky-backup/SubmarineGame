package submarinegame;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel firstPanel;
	
	private JCoordinateButton[][] cells = new JCoordinateButton[15][20];
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
	
		setTitle("Submarine Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setResizable(false);
		
		firstPanel = new JPanel();
		
		firstPanel.setLayout(new BorderLayout());
		
	
		for (int i = 0 ; i < 15 ; i++) {
			
			for (int j = 0 ; j < 15 ; j++) {
				
				cells[i][j] = new JCoordinateButton(j, i);
				
			}
			
		}
	
	}
	
	
	public void gameStart() {
		
		remove(firstPanel);
		
	}

}
