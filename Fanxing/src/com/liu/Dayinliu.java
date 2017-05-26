package com.liu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Dayinliu {

	public static void main(String[] args) throws Exception {
		PrintStream out = new PrintStream(new FileOutputStream(new File("d:"+ File.separator + "test.txt")));
				out.print(3 + " + " + 2 + " = ");
				out.println(2 + 3);
				out.println("Hello itcast!") ;
				out.close();
	}

}
