package Filehandling;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class Bufferreader {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	//====================================================================
	
	BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
	String line;
	while((line=br.readLine())!=null) {
		System.out.println(line);
		
	}
	br.close();
	/*
	//================================================================
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name=br.readLine();
	System.out.println(name);
	br.close();
	
	BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"));
	bw.write("helo ram");
	bw.newLine();
	bw.write("ram ram jai ram");
	bw.close();
	System.out.println(bw);
	*/
}

}
