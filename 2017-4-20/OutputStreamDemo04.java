import java.io.File ;    
import java.io.OutputStream ;    
import java.io.FileOutputStream ;    
public class OutputStreamDemo04{    
    public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        OutputStream out = null ;   // ׼����һ������Ķ���     
        out = new FileOutputStream(f,true)  ;   // �˴���ʾ���ļ�ĩβ׷������     
        // ��3��������д����     
        String str = "\r\nHello World!!!" ;     // ׼��һ���ַ���     
        byte b[] = str.getBytes() ;         // ֻ�����byte���飬���Խ��ַ�����Ϊbyte����     
        for(int i=0;i<b.length;i++){     // ����ѭ����ʽд��     
            out.write(b[i]) ;   // ÿ��ֻд��һ������     
        }    
        // ��4�����ر������     
        out.close() ;                       // �ر������     
    }    
};    