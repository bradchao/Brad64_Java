package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GNum extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	public GNum() {
		super("猜數字遊戲");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		
		guess.addActionListener(this);
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		answer = createAnswer(3);
	}
	public static void main(String[] args) {
		new GNum();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String strInput = input.getText();
		String result = checkAB(strInput);
		log.append(strInput + " => " + result + "\n");
		input.setText("");
	}

	private String checkAB(String g) {
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++) {
			char c = g.charAt(i);
			if (c == answer.charAt(i)) {
				A++;
			}else if (c 是否存在於 answer) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}
	private String createAnswer(int n) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i<poker.length; i++) poker[i] = i;
		
		for (int i = num-1; i > 0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++) {
			sb.append(poker[i]);
		}
		
		return sb.toString();
	}
	
}

class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}

