package com.liu;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Send implements Runnable {
	private PipedOutputStream pos=null;
	public Send(){
		pos=new PipedOutputStream();
	}
	public PipedOutputStream getPos (){
		return pos;
	}
	public void run(){
		String s="�������໨���峤��ι����";
		try {
			pos.write(s.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			pos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
