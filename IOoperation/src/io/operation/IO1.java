package io.operation;
import java.io.File;
import java.io.IOException;
public class IO1 {
public static void main(String[] args) throws IOException
{
	/*
	 * File f= new
	 * File("C:\\Users\\anand\\eclipse-workspace\\IOoperation"," hello1.txt");
	 * f.createNewFile(); System.out.println(f.exists());
	 */
	// make a new folder (directory) 
	/*
	 * File f =new File("newdirectory"); f.mkdir(); System.out.println(f.exists());
	 */
	// make a folder and add sub file in side folder
	/*
	 * File f = new File("new_folder1"); f.mkdir(); File f1= new
	 * File("new_folder1","abc.pdf"); f1.createNewFile();
	 * System.out.println(f1.exists()); System.out.println(f.isDirectory());// it is
	 * used to check the folder(directory is present or not
	 * System.out.println(f1.isFile());
	 */// it is ud=sed for check the fike is present or not
	//String location ="C:\\new_folder2";
	File f2= new File("C:\\new_folder2");
	f2.mkdir();
	File f3= new File(f2,"h.pdf");
	f3.createNewFile();
	System.out.println(f3.exists());
	System.out.println(f2.isDirectory());
	System.out.println(f3.isFile());
}
}