package com.guangyang3;
import java.util.*;
public class trycatch {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		try{
			int cc = a.nextInt();
			System.out.println("aaa");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.exit(0);
		}
	}
	
}