package ie.gmit.java2;


import java.util.*;// imports all java utilities

public class FileRunner {
	public static Scanner console = new Scanner(System.in);// allows user to input 

	public static void main(String[] args)
	{
		RunFile();// calls run file method
		
	}// main
		
		public static void RunFile()
		{
		Scanner console = new Scanner(System.in);// allows user input
		FileParser fp = new FileParser();// calls FileParse Class File
		
		int choice = 10;// variable used for switch 
		String file;
		System.out.println("Enter the file you want to work on : (example.txt)"  );
		file=console.nextLine();// puts user input into file variable
		fp.parse(file);// parses the file the user inputs
		
		while (choice != 0) // Continue until 0/Exit sentinel encountered
		{
			switch (choice)
			{
				case 1:
					String contains;
					System.out.println("Enter a words see if it appears in the file : "  );//asks user for word
					contains=console.nextLine();
					System.out.println(contains +" Appears in the file  " +  fp.contains(contains) );// prints if word is in file
					System.out.println();
				break;
				case 2:
					String search;
					System.out.println("Enter a word to search for : "  );//asks user for word
					search=console.nextLine();
					System.out.println("The first mention of the word " + search + 
							" appears at word: "+ fp.indexOf(search)+1 );// prints first index of word
					System.out.println();
				break;
				case 3:
					String search1;
					System.out.println("Enter a word to search for : "  );//asks user for word
					search1=console.nextLine();
					System.out.println("The last mention of the word " + search1 + 
							" appears at word: "+ fp.lastIndexOf(search1)+1);// prints last index of word
					System.out.println();
				break;
				case 4:
					System.out.println("File contains " + fp.size() + " words");// prints number of words in file
					break;
				case 5:
					String delete;
					System.out.println("Enter a word to delete : "  );
					delete=console.nextLine();
					fp.remove(delete);// deletes word from file
				break;
				case 6:
					String occur;
					System.out.println("Enter a word to search occurance of : "  );//asks user for word
					occur=console.nextLine();
					System.out.println("The word occurs :  "+ fp.occurrence(occur) );// prints first index of word
					System.out.println();
				break;
				case 7:
					System.out.println("Enter the file you want to work on : "  );
					file=console.nextLine();// puts user input into file variable
					fp.parse(file);// parses the file the user inputs
				break;
				case 8:
					Runner.Menu();// calls menu from Runner class 
				break;
				default:
			} // switch

			System.out.println();

			choice = showMenu(); // subsequent read

		} // while

				
	}// RunFile
	public static int showMenu()// Option Menu
    {
		int choice;
		System.out.println();
        System.out.println("              File Menu             ");
        System.out.println("============================================================");
        System.out.println("1: See if a word appears     2: First Mention of a word");
        System.out.println("3: Last Mention of a word    4: Return size of the file");
        System.out.println("5: Delete a word from File   6: Find Occurance of a word");
        System.out.println("7: To parse another file  ");
        System.out.println("8: Return to Main Menu  ");
        System.out.println("Press 0 to close menu");
        System.out.println();
        System.out.print("Enter option: ");
        System.out.println();
		choice = console.nextInt();

        return choice;
    }// showMenu

}
