package com.guangyang;
import java.io.FileInputStream;
import java.util.*;

public class Get {

	public static void main(String[] args) {
		Properties pps = new Properties();
		//pps.load(new FileInputStream("test.properties"));
		Enumeration enum1 = pps.propertyNames();
		while (enum1.hasMoreElements()){
			//String strKey = (String) enum1.Elements();
		}
	}

}
/*
 * 
 *Array-------------arrayLisst
 * List s = Arrays.asList("aa","aaa,","aaaa");
 * arrayLisst---------array
 * 
 * */