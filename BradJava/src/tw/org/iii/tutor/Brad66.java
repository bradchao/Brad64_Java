package tw.org.iii.tutor;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Brad66 {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
				InetAddress.getByName("10.0.104.190"), 9957);
			
			OutputStream oout = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("Hello, TCP");
			bw.flush();
			bw.close();
			
			socket.close();
			System.out.println("Send OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
