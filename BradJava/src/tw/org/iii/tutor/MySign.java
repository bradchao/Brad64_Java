package tw.org.iii.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.org.iii.myclasses.MyDrawer;

public class MySign extends JFrame{
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名");
	
		myDrawer = new MyDrawer();
		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MySign();
	}

}
