package com.guangyang;
//package com.guangyang;
//
//import java.util.*;
//import java.io.*;
//
//public class GetProperties {
//
//	public static void main(String[] args) throws FileNotFoundException,IOException {
//		Properties pps = new Prooerties();
//		pps.load(new FilelnputStream("test.properties"));
//		Enumeration enum1 = pps.propertyNames();
//		while(enum1.hasMoreElements()){
//			String strKey = (String) enum1.nextElement();
//			String strValue = pps.getProperty(strKey);
//			System.out.println(strKey + "="+strValue);
//		}
//	}
//
//}
import java.io.File ;    
import java.io.OutputStream ;    
import java.io.FileOutputStream ;    
public class GetProperties{    
    public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        OutputStream out = null ;   // ׼����һ������Ķ���     
        out = new FileOutputStream(f)  ;    // ͨ�������̬�ԣ�����ʵ����     
        // ��3��������д����     
        String str = "Hello World!!!" ;     // ׼��һ���ַ���     
        byte b[] = str.getBytes() ;         // ֻ�����byte���飬���Խ��ַ�����Ϊbyte����     
        out.write(b) ;                      // ����������������ļ�     
        // ��4�����ر������     
        out.close() ;                       // �ر������     
    }    
}; 