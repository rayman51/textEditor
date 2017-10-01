package ie.gmit.java2;

import java.io.*;// imports java packages
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FileParser
{
	BufferedReader br = null;//set to null
	BufferedWriter bw = null;//set to null
	
	private List<String> fileContents = new ArrayList<String>();// creates an array list 
	private File file = null;
	//===============================
	public FileParser()
	{
		
	}// parse method
	//===============================
	public FileParser(String fileName)
	{
		this.file = (new File(fileName));
	}// parse method
	//===============================
	public FileParser(File file)
	{
		this.file = file;
	}// parse method
	//===============================
	public void parse()
	{
		this.parse(this.file);
	}// parse method
	//===============================
	public void parse(String fileName)
	{
		this.parse(new File(fileName));
	}// parse method
	//===============================
	public void parse(File file) 
	{
		BufferedReader br = null;
		try
		{//try1
			br = new BufferedReader(new InputStreamReader(
				new  FileInputStream(file)));	// name of input file 
		}//try1
		catch(FileNotFoundException e)
		{//catch1
			e.printStackTrace();
		}//catch1
		
		try
		{//try2
			bw = new BufferedWriter(new FileWriter(
				new  File("outPut.txt")));	// name of output file
			
			String s =null;
			while((s = br.readLine())!= null)//reads in the file
			{//while1
				bw.write(s);
				bw.newLine();
				String [] str = s.split("\\s+");
				// add to a list that maintain all the words in the file
				fileContents.addAll(Arrays.asList(str));
				
			}//while1
			 bw.flush();
			 bw.close();
			 br.close();
		}
		catch(IOException e)
		{//catch2
			e.printStackTrace();
		}//catch2
	}// parse method
	//===============================
	
	public boolean contains(Object o)
	{
		return fileContents.contains(o);
	}// contains method
	
	//===============================
	public boolean remove(String delete)
	{
		return fileContents.remove(delete);
	}// remove method
	//===============================
	public int indexOf(Object o)
	{
		return fileContents.indexOf(o);
	}// first index of method
	//===============================
	
	public int lastIndexOf(Object arg0) 
	{
		return fileContents.lastIndexOf(arg0);
	}// last index of method
	//===============================
	
	public int size() 
	{
		return fileContents.size();
	}// size method
	//===============================
	public int occurrence(String s) 
	{
		
		int count=0;
		
		for(int i =0; i<fileContents.size(); i++)
		{
			if (fileContents.get(i).contentEquals(s))
			{
				count++;
			}
			
		}
		return count;
	}// count occurrence method
}// class
