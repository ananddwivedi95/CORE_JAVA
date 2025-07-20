package io.operation;
import java.io.*;
class FileWriter1 {

	public static void main(String[] args) throws Exception
 {
	File f= new File("D:","abc1.txt");
	FileWriter f1= new FileWriter(f);
	f1.write(" ");
	f1.write("hello");
	f1.close();
	FileReader f2= new FileReader("D:\\abc1.txt");
	System.out.println((char)f2.read());
	
	
 }
}
