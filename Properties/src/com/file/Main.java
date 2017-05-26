package com.file;

import java.io.File;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		//创建File实例
//		File file = new File("D:/test.txt");
//		try{
//			file.createNewFile();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		System.out.println("name="+file.getName());
//		System.out.println("name="+file.getAbsolutePath());
//		System.out.println("name="+file.getPath());
//		System.out.println("parent="+file.getParent());
//		System.out.println("length="+file.length());
//		if(file.exists()){
//			file.delete();
//		}
		File file = new File("D:/test.txt");
		//String [] strings = file.list();
		File[] strings = file.listFiles();
		findFile(file);
//		for(File s: strings){
//			if(s.isDirectory()){
//				s.listFiles();
//			}else{
//				System.out.println(s.getAbsolutePath());
//			}
//			
//		}
	}
	public static void findFile(File f){
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for(File f1:files){
				findFile(f1);
			}
		}else{
			System.out.println(f.getAbsolutePath());
		}
	}
	//作业一：查询出src目录下的所有。java文件
	//作业二：用户输入内容保存到文件中，不能覆盖
	//作业三：改进FileOutputStream写入

}
