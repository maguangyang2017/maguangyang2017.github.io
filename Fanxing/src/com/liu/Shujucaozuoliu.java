package com.liu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Shujucaozuoliu {

	public static void main(String[] args) throws Exception  {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		double d = Math.random();
		System.out.println("-->"+d);
		dos.writeDouble(d);
		dos.writeBoolean(true);
		dos.writeFloat(3.14f);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		DataInputStream dis = new DataInputStream(bais);
		System.out.println(dis.readBoolean());// true
		System.out.println(dis.readDouble());// Ëæ»úÊý
		System.out.println(dis.readFloat());
		dos.close();
		dis.close();
	}

}
