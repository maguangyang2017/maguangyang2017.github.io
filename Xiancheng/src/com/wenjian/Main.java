package com.wenjian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//�����ļ�
		File file = new File("D:/Program Files/Java/java/Xiancheng/src/com/wenjian/text.txt");
		//�ж��ļ��Ƿ����
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		FileReader fileReader = null;
		//���ļ�����
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//����һ���ַ�����������������������
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
		//�ر�������
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
