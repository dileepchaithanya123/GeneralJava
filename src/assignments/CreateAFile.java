package assignments;

import java.io.File;
import java.io.IOException;



public class CreateAFile {
	
	static File file;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		file = new File("test.txt");
		if(!file.exists())
			file.createNewFile();
		
		System.out.println("File Created");

		
		Thread.sleep(3000);
		CreateAFile.run();
		
	}
	
	public static void run()
	{
		file.delete();
		System.out.println("File got destroyed");
	}

}
