package Ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Alllines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           var result = Files.readAllLines(Paths.get("E:\\Eclipse\\file\\READ\\readme.txt"));
           for(String d : result) {
        	   System.out.println(d);
           }
	}

}