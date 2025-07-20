package io.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File1File2CopyFile3 {
public static void main(String[] args) throws Exception
{
	  //write the content in the file1.txt 
	  PrintWriter f= new  PrintWriter("File1.txt");
	  f.write("anand"); 
	  f.write("  dwivedi"); 
	  f.flush();
	  f.close(); 
	  //write the content in the file2.txt  
	  PrintWriter f1= new PrintWriter("File2.txt");  
	  f1.write("B.tech"); 
	  f1.write("\nunited institute of technology ");
	  f1.write("\nsailery");
	  f1.print(" "+202600000); 
	  f1.flush(); 
	  f1.close(); 
	  //using BufferedReader read the data from the file1.txt 
	  //BufferReader is used because we can read all the data Line By Line instead of character by character 
	  BufferedReader br= new BufferedReader(new FileReader("File1.txt"));
	  String line=br.readLine();
	  while(line!=null) 
	  { 
		  System.out.println(line); 
		  line=br.readLine(); 
	  }
	  
	  //using BufferReader for reading file2.txt //using BufferReader we can read Line By Line instead of character by character 
	  BufferedReader br1= new BufferedReader(new FileReader("File2.txt")); 
	  String line1=br1.readLine();
	  while(line1!=null) 
	  {  
		  System.out.println(line1); 
		  line1=br1.readLine(); 
	   }
	  br.close(); 
	  br1.close();
	 
	BufferedReader br2= new BufferedReader(new FileReader("File1.txt"));
	BufferedReader br3= new BufferedReader(new FileReader("File2.txt"));
	String line2=br2.readLine();
	String line3=br3.readLine();
	PrintWriter f2= new PrintWriter("File_3.txt"); 
	  while(line2!=null || line3!=null)
	  { 
		  if(line2!=null)
	      {
			  f2.write("\n"+line2);
	          line2=br2.readLine();
	      }  
		  if(line3!=null) 
		  { 
			  f2.write("\n"+line3);
         	  line3=br3.readLine(); 
          } 
      }
	  f2.flush();
	  BufferedReader br4= new BufferedReader(new FileReader("File_3.txt"));
	  String line4=br4.readLine();
	  while(line4!=null)
		  { 
		   System.out.println(line4);
		   line4=br4.readLine();
		  }
	br2.close();
	br3.close();
	br4.close();
	
    
	
}
}
