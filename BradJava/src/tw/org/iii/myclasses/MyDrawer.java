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
	private LinkedList<LinkedList<Point>> lines, recycleBin;
	
	public MyDrawer() {
		setBackground(Color.YELLOW);

		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();
		
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycleBin.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
			repaint();
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for (LinkedList<Point> line : lines) {
			for (int i=1; i<line.size(); i++) {
				Point p0 = line.get(i-1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
		
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			recycleBin.clear();
			LinkedList<Point> line = new LinkedList<>();
			
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			line.add(point);
			lines.add(line);

			repaint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX(); point.y = e.getY();
			
			lines.getLast().add(point);
			
			repaint();
		}
	}
}

class Point {
	public int x, y;
}




