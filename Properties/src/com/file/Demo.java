package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		File file = new File("D:/test.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			char[] chars = new char[20];//������
//			fileReader.read(chars);
//			for(char c:chars){
//				System.out.println(c);
//			}
			String s = "";
			int len = 0;//���׶��˶��ٸ��ַ�
//			while((len = fileReader.read(chars))!=-1){
//				String ss = new String(chars,0,len);
//				s+=ss;
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
