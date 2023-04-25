package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<Point> points;
	
	public MyDrawer() {
		setBackground(Color.YELLOW);

		points = new LinkedList<>();
		
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for (int i=1; i<points.size(); i++) {
			Point p0 = points.get(i-1);
			Point p1 = points.get(i);
			g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
		}
		
		
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			points.add(point);
			repaint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			points.add(point);
			repaint();
		}
	}
}

class Point {
	public int x, y;
}




