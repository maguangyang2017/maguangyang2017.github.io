package one;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
	}
	public class FileNameSelector implements FilenameFilter{
		String extension = "";
		public FileNameSelector(String fileExtensionNoDot){
			 extension += fileExtensionNoDot;
		}
		@Override
		 public boolean accept(File dir, String name)
		 {
		  return name.endsWith(extension);
		 }
		 public void main(String[] args)
		 {
		  File directory = new File("E:\\data\\file_selector_test");
		 }

	}

}
