package com.wenjian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//创建文件
		File file = new File("D:/Program Files/Java/java/Xiancheng/src/com/wenjian/text.txt");
		//判断文件是否存在
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		FileReader fileReader = null;
		//将文件读入
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//定义一个字符串对象用来储存读入的数据
		StringBuffer s = new StringBuffer();
		int len = 0;
		char[] chars = new char[1024] ;
		try {
			while((len = fileReader.read(chars))!=-1){
				s.append(new String(chars,0,(len)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//关闭输入流
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file2 = new File("D:/Program Files/Java/java/Xiancheng/src/com/wenjian/text2.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		FileWriter output = null;
		try {
			output = new FileWriter(file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
