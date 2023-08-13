import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>();
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		
		setFileName(fileName);
		setStringLength(stringLength);
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		
		return stringList.size();
		
	}//end getArrayListSize
	
	public void processFile() throws Exception {
		
		StringTooLongException excMessage = new StringTooLongException("String is too long!");
		
		FileReader fileRead;
		BufferedReader buffReader;
				
		try {
			File aFile = new File (fileName);
			Scanner input = new Scanner(aFile);
			
			fileRead = new FileReader(fileName);
			buffReader = new BufferedReader(fileRead);
			
			String line; 
			
			while((line = buffReader.readLine()) != null) {
				if (line.length() > 5) {
					throw excMessage;
				}
				else {
					stringList.add(line);
					System.out.println(line);
					System.out.println(stringList);
				}
			}
			
		buffReader.close();
		input.close();
		
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		catch(StringTooLongException e) {
			System.out.println("String is too long!");
		}
	}//end processFile

	public String getFileName() {
		
		return fileName;
		
	}// end getFileName

	public void setFileName(String fileName) {
		
		this.fileName = fileName;
		
	}// end setFileName

	public int getStringLength() {
		
		return stringLength;
		
	}// end getStringLength

	public void setStringLength(int stringLength) {
		
		if (stringLength < 5) {
			this.stringLength = 5;
		}
		else {
			this.stringLength = stringLength;
		}
				
	}// end setStringLength
	
}//end class