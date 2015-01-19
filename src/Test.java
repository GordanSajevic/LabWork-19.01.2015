import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


public class Test{

	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		Paint panel = new Paint();
		window.add(panel);
		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static class Paint extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			CrossedCircle c = new CrossedCircle(g);
			c.drawAt(50, 50, 100, 100);
		}
	}

}
