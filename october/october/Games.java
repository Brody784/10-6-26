package october;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Games {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("MY GAME");
		Dimension dim = new Dimension(800,600);
		GamePanel gamePanel = new GamePanel(dim);
		frame.setSize(dim);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(gamePanel);
		frame.setVisible(true);
		gamePanel.timer.start();
	}

}
