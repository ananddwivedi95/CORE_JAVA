package io.operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
public static void main(String[] args) throws Exception
{
	FileWriter f= new FileWriter("nitin_manjunath.txt");
	BufferedWriter bw1= new BufferedWriter(f);
	bw1.write("jai "+"mahadev ");
	bw1.newLine();
	bw1.write("jai mahadev");
	bw1.flush();
	bw1.close();
	FileReader f1= new FileReader("nitin_manjunath.txt");
	BufferedReader br1= new BufferedReader(f1);
	String line=br1.readLine();
	while(line!=null)
	{
		System.out.println(line);
		line=br1.readLine();
	}
	System.out.println(br1.readLine());
	
}
}
