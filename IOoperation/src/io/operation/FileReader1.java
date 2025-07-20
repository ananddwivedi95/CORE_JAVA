package io.operation;
import java.io.*;
public class FileReader1 {
public static void main(String[] args) throws Exception
{
	//File f1= new File("D:","new_1.txt");
	File f1= new File("D:\\Anand_IOFolder");
	f1.mkdir();
	File f2= new File(f1,"anand.txt");
	f2.createNewFile();
	FileWriter f3= new FileWriter(f2);
	f3.write("hello");
	f3.write("\n");
	f3.write("hii");
	f3.write("\n");
	f3.write("jai mahadev");
	f3.close();
	System.out.println();
	FileReader f= new FileReader(f2);
	int i=f.read();
	while(i!=-1)
	{
	System.out.print((char)i);
	i=f.read();
	}
	System.out.println("\n"+f1.isDirectory());
	System.out.println(f2.isFile());
	
}
}
