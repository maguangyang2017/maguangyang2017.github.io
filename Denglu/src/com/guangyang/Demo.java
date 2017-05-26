package com.guangyang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:/Program Files/Java/java/Denglu/src/com/guangyang/text.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		String userInput = "";
		System.out.println("请输入用户名和密码");
		userInput = sc.nextLine();
		RandomAccessFile randomAccessFile = null;
		try {
			randomAccessFile = new RandomAccessFile(file,"r");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			 if(randomAccessFile!=null){
					try {
						randomAccessFile .close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				 }
		}
		try {
			if(randomAccessFile.readUTF()==userInput){
				System.out.println("输入正确");
			}else{
				System.out.println("输入错误");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(randomAccessFile!=null){
				try {
					randomAccessFile .close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
		}
//		String userInput = "";
//		System.out.println("请输入文件内容");
//		userInput = sc.nextLine();
//		RandomAccessFile randomAccessFile = null;
//		try {
//			randomAccessFile = new RandomAccessFile(file,"rw");
//			randomAccessFile.seek(file.length());
//			randomAccessFile.write(userInput.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally{
//			 if(randomAccessFile!=null){
//				try {
//					randomAccessFile .close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			 }
//		}
		
	}

}
