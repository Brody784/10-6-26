package october;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Dimension dim;
	Timer timer;
	Circle circle;
	
	public GamePanel(Dimension dim) {
		this.setSize(dim);
		this.setBackground(Color.black);
		this.timer = new Timer(20, this);
		circle = new Circle(100, 100, 2, 1, "One", Color.red, 50);
		this.setIgnoreRepaint(true);
	}
	
	public void update() {
		circle.Update();
	}
	
	public void render(Graphics g) {
		circle.Render(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.render(g);
		
		Toolkit.getDefaultToolkit().sync();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
		this.repaint();
		
		
	}

}
