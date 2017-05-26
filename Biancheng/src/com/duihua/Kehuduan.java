package com.duihua;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Kehuduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.162",8999);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.write("ะกร๗\n");
			printWriter.flush();
			new Thread(new Write(socket)).start();
			new Thread(new In(socket)).start();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
