package tw.org.iii.myclasses;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	public MyDrawer() {
		setBackground(Color.YELLOW);
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("press:" + e.getX() + ", " + e.getY());
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("drag:" + e.getX() + ", " + e.getY());
		}
	}
}
