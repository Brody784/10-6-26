package october;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Game{
	
	private int size;
	
	public Circle(){
		this.size = 0;
	}
	public Circle(int x, int y, int speed, int direction, String string, Color color, int size){
		super(x, y, speed, direction, string, color);
		this.setSize(size);
		
	
	}
	
	public void Update() {
		this.setX(this.getX() + this.getSpeed());
		if(this.getX()> 800) {
			this.setX(-100);
		}
	}
	
	public void Render(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getSize(), this.getSize());
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
