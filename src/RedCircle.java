import java.awt.Color;
import java.awt.Graphics;


public class RedCircle extends Circle{

	private Graphics g;
	
	public RedCircle(Graphics g) {
		super(g);
		this.g = g;
	}
	
	@Override
	public void drawAt(int x, int y, int width, int height)
	{
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
	}
	

}
