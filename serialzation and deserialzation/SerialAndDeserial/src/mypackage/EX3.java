package mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Industry implements Serializable{
	public int id;
	public String Name;
	public String ITcode;
	public int mob;
	
	public Industry(int id,String Name,String ITcode,int mob){
		this.id = id;
		this.Name = Name;
		this.ITcode = ITcode;
		this.mob = mob;
	}
}


public class EX3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		/* Industry Ind = new  Industry(10, "sam", "ASF2D", 9999);
		FileOutputStream FInd = new FileOutputStream("E:\\Eclipse\\serialzation and deserialzation\\Industry\\ind.txt");
		ObjectOutputStream out = new ObjectOutputStream(FInd);
		
		out.writeObject(Ind);
		out.close();
		System.out.println("File is Saved"); */
		
		FileInputStream fin = new FileInputStream("E:\\\\Eclipse\\\\serialzation and deserialzation\\\\Industry\\\\ind.txt");
		ObjectInputStream Inobj = new ObjectInputStream(fin);
		Industry find = (Industry) Inobj.readObject();
		
		System.out.println("id ="+find.id);
		System.out.println("Name ="+find.Name);
		System.out.println("ITcode ="+find.ITcode);
		System.out.println("mob ="+find.mob);
		
		
		
	}

}
