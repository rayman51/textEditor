package ie.gmit.java2;

import java.io.*;//imports java packages
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlParser
{
	
	BufferedReader in = null;//set to null
	BufferedWriter out = null;//set to null
	private List<String> UrlContents = new ArrayList<String>();// creates an array list 
	private File site = null;
	//===============================
	public int indexOf(Object arg0)
	{
	return UrlContents.indexOf(arg0);
	}// first index of method
	//===============================

	public boolean contains(Object arg0)
	{
		return UrlContents.contains(arg0);
	}// contains method
	//===============================

	public int size()
	{
		return UrlContents.size();
	}// size method
	//===============================

	public int lastIndexOf(Object o)
	{
		return UrlContents.lastIndexOf(o);
	}// last index of method
	
	//===============================

	public boolean remove(String delete)
	{
		return UrlContents.remove(delete);
	}// remove method
	//===============================

	@SuppressWarnings({ "null", "resource" })
	public void parse(String site){
    	URL webSite = null;
		try 
		{//try
			webSite = new URL(site);
		} //try
		catch (MalformedURLException e) 
		{//catch
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
        BufferedReader in = null;
		try 
		{//try
			in = new BufferedReader(
			new InputStreamReader(webSite.openStream()));// reads in URL
		}//try
		catch (IOException e) 
		{//catch
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
     
		String inputLine;// variable used to store URL data
        try
		{//try
			
			BufferedWriter out = new BufferedWriter(new FileWriter(
				new  File("outPut.txt")));	// name of output file
			
			while((inputLine = in.readLine())!= null)//reads in the file
			{//while1
				out.write(inputLine);
				out.newLine();
				String [] str = inputLine.split("\\s+");
				// add to a list that maintain all the words in the file
				UrlContents.addAll(Arrays.asList(str));
				
			}//while1
			 out.flush();
			 out.close();
			 in.close();
		}//try
        catch(IOException e)
		{//catch
			e.printStackTrace();
		}//catch
    
    
	}// parse method
	//===============================
	public int occurrence(String s) 
	{
		
		int count=0;
		
		for(int i =0; i<UrlContents.size(); i++)
		{
			if (UrlContents.get(i).contentEquals(s)){
				count++;
			}
			
		}
		return count;
	}// Occurrence method
        
	
}// class
