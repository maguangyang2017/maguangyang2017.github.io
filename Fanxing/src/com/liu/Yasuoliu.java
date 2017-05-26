package com.liu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Yasuoliu {

	public static void main(String[] args) {
		File f = new File("temp.txt");
		File zf = new File("temp.zip");
		try ( InputStream is = new FileInputStream(f);
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zf));) {
				zos.putNextEntry(new ZipEntry(f.getName()));zos.setComment("I'm cditcast");
				int len = 0;
				byte[] bys = new byte[1024];
				while ((len = is.read(bys)) != -1) {
					zos.write(bys, 0, len);
				}
		} catch (Exception e) {
			
		}
	}
	
}
