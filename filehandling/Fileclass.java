package Filehandling;
import java.util.*;
import java.io.*;

public class Fileclass {
public static void main(String[] args) throws IOException {
	File f=new File("sample1.txt");
	if(f.createNewFile()) {
		System.out.println("file created  "+f.getName());
		
	}
	else {
		System.out.println("file already exist");
	}
	if(f.exists()) {
		System.out.println(f.getName());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.length());
//		System.out.println();
//		System.out.println();
//		System.out.println();
	}
	
	int ch;

FileWriter fw=new FileWriter("sample.txt");
fw.write("hi saiteja welcome to sand");
System.out.println(fw.toString());
fw.close();
FileReader fr = new FileReader(f);
while((ch=fr.read())!=-1) {
	System.out.print((char) ch);
}
fr.close();
}
}
