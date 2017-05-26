package com.liu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class Hebingliu {

	public static void main(String[] args) {
		String src1 = "d:/a.txt";
		String src2 = "d:/b.txt";
		String dest = "d:/ab.txt";
		try (
		InputStream is1 = new FileInputStream(src1);
		InputStream is2 = new FileInputStream(src2);
		OutputStream os = new FileOutputStream(dest);
		SequenceInputStream sis = new SequenceInputStream(is1, is2);
		) {
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
		os.write(bys, 0, len);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
