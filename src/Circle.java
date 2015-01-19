import java.awt.Color;
import java.awt.Graphics;


public class Circle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private Graphics g;
	
	public Circle(Graphics g) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.g = g;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void drawAt(int x, int y, int width, int height)
	{
		g.setColor(Color.BLUE);
		g.fillOval(x, y, width, height);
	}
	
}
