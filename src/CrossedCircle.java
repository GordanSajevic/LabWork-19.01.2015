import java.awt.Color;
import java.awt.Graphics;


public class CrossedCircle extends Circle{

	private Graphics g;
	
	public CrossedCircle(Graphics g) {
		super(g);
		this.g = g;
	}
	
	@Override
	public void drawAt(int x, int y, int width, int height)
	{
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawLine(x-width/2, y-height/2, x+width/2, y+height/2);
		g.drawLine(x+width/2, y-height/2, x+width/2, y+height/2);
	}

}
