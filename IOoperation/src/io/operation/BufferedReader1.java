package io.operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader1 {
	 public static void main(String[] args) throws Exception
	 {
		 FileReader f= new FileReader("nitin_manjunath.txt");
		 BufferedReader br= new BufferedReader(f);
		 String line= br.readLine();
		 while(line!=null)
		 {
			 System.out.println(line);
			 line=br.readLine();
		 }
		 br.close();
	 }

}
