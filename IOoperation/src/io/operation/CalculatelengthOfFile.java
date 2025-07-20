package io.operation;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class CalculatelengthOfFile {
public static void main(String[] args) throws Exception
{
	File f= new File("nitin_inewron_1.txt");
	f.createNewFile();
	System.out.println(f.isFile());
	FileWriter f1= new FileWriter(f);
	f1.write("name : anand dwivedi");
	f1.write("\nhighest qulification : b.tch");
	f1.write("\ncollege : united institute of technology");
	f1.write("\nworking : tesla");
	f1.flush();
	f1.close();
	
	FileReader f2= new FileReader(f);
	char [] ch=new char[(int)f.length()];
	//read one character from file and store it in char array then 
	f2.read(ch);
	  for(char Data:ch)
	   System.out.print(Data);
    f2.close();
	 
}
}
