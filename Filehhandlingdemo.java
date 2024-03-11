package mypacakge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filehhandlingdemo {

	public static void main (String[] args) throws IOException {
		
		// Represent a file
		
		// abosulte path or full path D:\\Eclipse\\projects\\MyFirstProject\\testfile.txt"
		// relative or short path: as the filet esfile is copied under the project we can giveABC\\testfile.txt
		
		File file = new File("ABC\\testfile.txt");
		
		/*if (file.exists()) {
			
			System.out.println("the exists in the provided path");
					
		}else {
			
			System.out.println(" The file is not avalaible in the provided path");
			
		}
		*/
		
		// Reading a file
		// predefined classess required are Filereader, Buffer Reader
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str= br.readLine())!=null) {
			
		
		System.out.println(str);
		}
		
		
		
	}
	
	
	
}
