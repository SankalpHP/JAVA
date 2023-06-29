package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	public int id ;
	public String Name;
	public int grade;
	public int mob;
	
	public student (int id, String Name, int grade, int mob) {
		this.id = id;
		this.Name = Name;
		this.grade = grade;
		this.mob = mob;
	}
}

public class ExamlpeTwo {

	public static void main(String[] args) throws IOException, ClassNotFoundException,FileNotFoundException {
		// TODO Auto-generated method stub
         
		/* student stud = new student(45, "Sankalp", 12, 99999);
		FileOutputStream fout = new FileOutputStream("E:\\Eclipse\\serialzation and deserialzation\\emp\\stud.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout); 
		
		out.writeObject(stud);
		
		out.close();
		
		System.out.println("file saved sucessfully"); */
		
		FileInputStream sin = new FileInputStream("\\Eclipse\\serialzation and deserialzation\\emp\\stud.txt"); 
		ObjectInputStream in = new ObjectInputStream(sin);
		
		student stud = (student) in.readObject();
		
		System.out.println("id ="+ stud.id);
		System.out.println("Name ="+ stud.Name);
		System.out.println("grade ="+ stud.grade);
		System.out.println("mob ="+stud.mob);
		
	}

}
