package com.file;

import java.io.File;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		//����Fileʵ��
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
	//��ҵһ����ѯ��srcĿ¼�µ����С�java�ļ�
	//��ҵ�����û��������ݱ��浽�ļ��У����ܸ���
	//��ҵ�����Ľ�FileOutputStreamд��

}
