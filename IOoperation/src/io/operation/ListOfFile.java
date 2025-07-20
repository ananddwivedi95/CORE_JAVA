package io.operation;
import java.io.*;
public class ListOfFile {
public static void main(String[] args)
{int count=0;
int dir=0;
int j_file=0;
int c_file=0;
	File f= new File("D:");
	String[] names=f.list();
	for(String name:names)
	{
		File f1= new File(f,name);
		if(f1.isDirectory())
	{
			dir++;
		
	}
		if(f1.isFile())
		{
			count++;
			if(name.endsWith(".java"))
			{
			    j_file++;
			}
			if(name.endsWith(".class"))
				
			{
				c_file++;
			}
		}
		System.out.println(name);
		count++;
	}
	System.out.println("no of Directory : "+dir+" no of file : "+count);
	System.out.println("no of java file : "+j_file+" no of class file : "+c_file);
}
}
