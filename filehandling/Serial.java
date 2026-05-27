package Filehandling;
import java.io.Serializable;
import java.io.*;
import java.util.*;
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
public class Serial {
public static void main(String[] args) {
	 try {

         // Create object
         Student s1 = new Student(101, "John");

         // File stream
         FileOutputStream fos =
             new FileOutputStream("student.dat");

         // Object stream
         ObjectOutputStream oos =
             new ObjectOutputStream(fos);

         // Save object
         oos.writeObject(s1);

         oos.close();
         fos.close();

         System.out.println("Student object saved successfully");

     } catch(Exception e) {

         e.printStackTrace();
     }
 }
}

