package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Myclass2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter F = new FileWriter("E:\\Eclipse\\file\\Write\\data.txt",true);//append
		F.write("Shane warn is a god of leg spin,\n");
		F.write("HE bowls a ball of the century,\n");
		F.write("He is first captain to win IPL, \n");
		F.write("==========================================\n");
		
		System.out.println("done in file");
		F.close();
	}

}
