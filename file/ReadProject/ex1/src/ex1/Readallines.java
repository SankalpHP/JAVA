package ex1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Readallines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		var result = Files.readAllLines(Paths.get("E:\\Eclipse\\file\\READ\\lines.txt"));
		
		for(var a : result) {
			System.out.println(a);
		}
		
		
	}

}
