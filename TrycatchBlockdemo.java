package mypacakge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TrycatchBlockdemo {

	public static void main(String[] args) {

		File file = new File("D:\\ABC\\xyz.txt");
		
		try {
		
			@SuppressWarnings("unused")
			FileReader fr = new FileReader(file);
						
	}catch (FileNotFoundException e) {
		
		//e.printStackTrace();
		
	}
		System.out.println("End of the program");
}
}