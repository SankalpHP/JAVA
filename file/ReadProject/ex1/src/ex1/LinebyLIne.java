package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LinebyLIne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File Fi = new File("E:\\Eclipse\\file\\READ\\lines.txt");
		FileReader fre = new FileReader(Fi);
		
		BufferedReader br = new BufferedReader(fre);
		
		String read = br.readLine();
		
		while(read != null) {
			System.out.println(read);
			read = br.readLine();
			
		}
		br.close();
		
		
	}

}
