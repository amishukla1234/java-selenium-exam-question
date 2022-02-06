import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaSeleniumQ2 {

	public static void main(String[] args) throws IOException {
		// create a variable for data file path
		String path ="src\\data.properties";
		// create an object
		Properties prop = new Properties();
		File doesFileExist= new File(path);
		FileInputStream fi = new FileInputStream(doesFileExist);
		
		prop.load(fi);
		// printing the output
		System.out.println(prop.getProperty("word1"));	
		System.out.println(prop.getProperty("meaning-1"));	
		System.out.println(prop.getProperty("meaning-2"));
		System.out.println(prop.getProperty("word2"));
		System.out.println(prop.getProperty("meaning1"));
		System.out.println(prop.getProperty("meaning2"));	
		System.out.println(prop.getProperty("word3"));
		System.out.println(prop.getProperty("meaning"));
			
			
	

	}
}
