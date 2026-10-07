package october;

import java.awt.Color;

public class Game {
	private int x;
	private int y; 
	private int speed;
	private int direction;
	private Color color;
	private String ID;
	
	public Game(){
		this.setX(0);
		this.setY(0);
		this.setSpeed(0);
		this.setDirection(0);
		this.setID(ID);
		this.setColor(Color.red);
	}
	
	public Game(int x, int y, int speed, int direction, String id, Color color) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.direction = direction;
		this.ID = id;
		this.color = color;
	}
	
	public void Show() {
		System.out.println(this.getX() +" "+ this.getY() + " " + this.getSpeed() + " " + this.getDirection() + " " + this.getID() + " " + this.getColor());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
