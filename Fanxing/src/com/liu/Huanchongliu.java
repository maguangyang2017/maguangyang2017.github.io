package com.liu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Huanchongliu {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("AA.txt"));
		String line = null;
		while((line = br.readLine()) != null){//读⼀⾏
			bw.write(line);//写⼀⾏
			bw.newLine();//写完⼀⾏就换⾏
		}
		bw.close();
		br.close();
	}

}
