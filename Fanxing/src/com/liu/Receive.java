package com.liu;

import java.io.IOException;
import java.io.PipedInputStream;

public class Receive implements Runnable{
	private PipedInputStream pis=null;
	public Receive(){
		pis=new PipedInputStream();
	}
	public PipedInputStream getPis(){
		return pis;
	}
	public void run(){
		byte[] bys= new byte[1024];
		int len = 0;
		try {
			len = pis.read(bys);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-->"+new String(bys,0,len));
	}
}
