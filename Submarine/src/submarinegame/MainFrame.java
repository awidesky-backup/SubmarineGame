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
	
	private JCellButton[][] cells;
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
	
		setTitle("Submarine Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setResizable(false);
		
		firstPanel = new JPanel();
		
		firstPanel.setLayout(new BorderLayout());
		
	
	
	}
	
	
	public void gameStart() {
		
		remove(firstPanel);
		
	}

}
