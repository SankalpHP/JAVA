package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Myclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File F = new File("E:\\Eclipse\\file\\READ\\lines.txt");
		
		FileReader Fr = new FileReader(F);
		
		int i = Fr.read();

		while( i != -1) {
			System.out.println((char)i);
			i = Fr.read();
		}
		Fr.close();
	}

}
