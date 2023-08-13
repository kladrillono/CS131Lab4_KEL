import java.io.*;

public class ExceptionApplication {

	public static void main(String[] args) throws Exception {
		
		FileProcessor fp = new FileProcessor("BadString.txt", 10);
		fp.processFile();
		
		FileProcessor fp2 = new FileProcessor("GoodString.txt", 10);
		fp2.processFile();
	
		//System.out.println(stringList);
		
	}// end main

}// end class
