package com.IO;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		//创建File实例
		File file = new File("D:\\Program Files/Java/java/IO/src/com/IO/Test.txt");
		//创建文件
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("name="+file.getName());
		System.out.println("path="+file.getAbsolutePath());
		System.out.println("name="+file.getPath());
		System.out.println("parent="+file.getParent());
		System.out.println("length="+file.length());
		
		/*
		 * 输出结果
		 * name=IO
		 * path=D:\Program Files\Java\java\IO\src\com\IO
		 * name=D:\Program Files\Java\java\IO\src\com\IO
		 * parent=D:\Program Files\Java\java\IO\src\com
		 * length=0
		 * 
		 * */
		/*if(file.exists()){
			file.delete();
		}*/
//		File file = new File("D:\\Program Files/Java/java/IO/src/com/IO/Test.txt");
//		try{
//			FileReader fileReader = new FileReader(file);
//			int a = fileReader.read();
//			char[] chars = new char[100];
//			fileReader.read(chars);
//			String s = "";
//			int leg = 0;
//			while((leg = fileReader.read(chars))!=-1){
//				String ss = new String(chars,0,leg);
//				s+=ss;
//			}
//			System.out.println(s);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}

}
/*
 * 	//作业一：查询出src目录下的所有.java文件
 * 	//作业二：用户输入内容保存到文件中，不能覆盖
 *	//作业三：改进FileOutputStream写入
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
