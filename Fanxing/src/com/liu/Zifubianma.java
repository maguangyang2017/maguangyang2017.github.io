package com.liu;

import java.util.Properties;

public class Zifubianma {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		//p.list(System.out);
		System.out.println(System.getProperty("file.encoding"));
	}

}
