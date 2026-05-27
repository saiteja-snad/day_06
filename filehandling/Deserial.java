package Filehandling;
import java.io.*;
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
public class Deserial {
	public static void main(String[] args) {
		try {
         FileInputStream fis = new FileInputStream("student.dat");
         ObjectInputStream ois =new ObjectInputStream(fis);
            Student s =(Student) ois.readObject();
            System.out.println("Student Details");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            ois.close();
            fis.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
	}

}
