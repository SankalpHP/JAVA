package Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Line {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          
		File Fi = new File("E:\\Eclipse\\file\\READ\\readme.txt");
		FileReader fre = new FileReader(Fi);
		BufferedReader br = new BufferedReader(fre);
		
		String read1 = br.readLine();
		
		while(read1 != null){
			System.out.println(read1);
			read1 = br.readLine();
		}
		br.close();
		
	}

}

