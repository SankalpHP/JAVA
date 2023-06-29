package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class employee implements Serializable{
	public int id;
	public String Name;
	public int Salary;
	
	public employee(int id , String Name , int Salary){
		
		this.id=id;
		this.Name=Name;
		this.Salary=Salary;
	}
	
}

public class Serialandeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException,FileNotFoundException {
		// TODO Auto-generated method stub
		
		/*employee emp = new employee(12, "sankalp", 500000); 
		
		FileOutputStream fout = new FileOutputStream("E:\\Eclipse\\serialzation and deserialzation\\emp\\emp.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(emp);
		out.close();
		System.out.println("object is saved"); */
		
		FileInputStream fin = new FileInputStream("E:\\\\Eclipse\\\\serialzation and deserialzation\\\\emp\\\\emp.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        
        employee emp = (employee) in.readObject();
        
        System.out.println("id ="+ emp.id);
        System.out.println("Name ="+ emp.Name);
        System.out.println("Salary ="+ emp.Salary);
	}

}
