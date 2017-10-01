package ie.gmit.java2;

import java.io.IOException;
import java.util.Scanner;

public class UrlRunner {
	public static Scanner console = new Scanner(System.in);// allows user to input 

	
		public static void main(String[] args)
		{
			RunUrl();// calls RunUrl method 
			
		}// main
		
		public static void RunUrl()
		{
			UrlParser ur = new UrlParser();// calls FileParse Class File
			Scanner console = new Scanner(System.in);
			int choice = 10 ;// variable used for switch 
			
	    	String site;
	    	System.out.println("Enter web site : (http://www.example.com)");
	    	site = console.nextLine();// puts user input into site variable
	    	ur.parse(site);// parses the Url the user inputs
	    
	   
	    	while (choice != 0) // Continue until 0/Exit sentinel encountered
			{
				switch (choice)
				{
					case 1:
						String contains;
						System.out.println("Enter a words see if it appears in the file : "  );//asks user for word
						contains=console.nextLine();
						System.out.println(contains +" Appears in the file  " +  ur.contains(contains));// prints if word is in URL
						System.out.println();
					break;
					case 2:
						String search;
						System.out.println("Enter a word to search for : "  );//asks user for word
						search=console.nextLine();
						System.out.println("The first mention of the word " + search + 
								" appears at word: "+ ur.indexOf(search)+1 );// prints first index of word
						System.out.println();
					break;
					case 3:
						String search1;
						System.out.println("Enter a word to search for : "  );//asks user for word
						search1=console.nextLine();
						System.out.println("The first mention of the word " + search1 + 
								" appears at word: "+ ur.lastIndexOf(search1)+1 );// prints last index of word
						System.out.println();
					break;
					case 4:
						System.out.println("File contains " + ur.size() + " words");// prints number of words in file
					break;
					case 5:
						String delete;
						System.out.println("Enter a word to delete : "  );
						delete=console.nextLine();
						ur.remove(delete);// deletes word from URL	
						break;
					case 6:
						String occur;
						System.out.println("Enter a word to search occurance of : "  );//asks user for word
						occur=console.nextLine();
						System.out.println("The word occurs :  "+ ur.occurrence(occur) );// prints first index of word
						System.out.println();
					break;
					case 7:
						System.out.println("Enter web site : (http://www.example.com)");
				    	site = console.nextLine();// puts user input into site variable
				    	ur.parse(site);// parses the URL the user inputs
					break;
					case 8:
						Runner.Menu();// calls menu from Runner class 
					break;
					default:
				} // switch

				System.out.println();

				choice = showMenu(); // subsequent read
			}
	}// main
	public static int showMenu()// Option Menu
    {
		int choice;
		System.out.println();
        System.out.println("              URL Menu             ");
        System.out.println("============================================================");
        System.out.println("1: See if a word appars     2: First Mention of a word");
        System.out.println("3: Last Mention of a word   4: Return Size of the URL");
        System.out.println("5: Delete a word from URL   6: Find Occurance of a word");
        System.out.println("7: To parse another URL");
        System.out.println("8: Return to Main Menu");
        System.out.println("Press 0 to close menu");
        System.out.println();
        System.out.print("Enter option: ");
        System.out.println();
		choice = console.nextInt();

        return choice;
    }// showMenu*/

}

