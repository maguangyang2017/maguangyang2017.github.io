package com.guangyang1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String aa ="ABCDE";
		StringBuffer ss = new StringBuffer();
//		for(int i=aa.length()-1;i>=0;i--){
//			ss.append(i+",");
//		}

//		System.out.println(ss.toString());
		int [] a = new int[3];
		for(int i = 0;i<3;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++){
			ss.append(a[i]+",");
		}
		System.out.println(ss.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str="ABCD";
//		byte[] bys = str.getBytes();
//		StringBuilder sBuilder = new StringBuilder("");
//		for (byte b : bys) {
//			sBuilder.append((char)b).append(",");
//		}
//		sBuilder.deleteCharAt(sBuilder.length()-1);
//		System.out.println(sBuilder.toString());
	}

}
