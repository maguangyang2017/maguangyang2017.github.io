package com.guangyang;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:/Program Files/Java/java/Fanxing/src/com/guangyang/text.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		String userInput = "";
		System.out.println("请输入文件内容");
		userInput = sc.nextLine();
		StringBuffer stringBuffer = new StringBuffer();
		int len;
		byte[] bytes = new byte[10];
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			while((len=fileInputStream.read(bytes))!=-1){
				stringBuffer.append(new String(bytes));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(fileInputStream != null){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String oldContext = stringBuffer.toString();
		String writerContext = "";
		if("".equals(oldContext)){
			writerContext = userInput+"\n";
		}else{
			writerContext = oldContext+userInput;
		}
		FileWriter fileWriter = null;
		try{
			fileWriter = new FileWriter(file);
			fileWriter.write(writerContext);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fileWriter!=null){
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		if(oldContext==userInput){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}

}
