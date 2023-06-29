package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Charby {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		File F = new File("E:\\Eclipse\\file\\READ\\readme.txt");
		
		FileReader fr = new FileReader(F);
		
		int a = fr.read();
		while(a != -1) {
			System.out.println((char)a);
			a = fr.read();
		}
		fr.close();
	}

}
