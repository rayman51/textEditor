package ie.gmit.java2;

import java.util.*;

public class Runner{
	public static Scanner console = new Scanner(System.in);// allows user to input 

	public static void main(String[] args) 
	{
		Menu();// calls menu method
	}//main
		public static void Menu()
		{
			Scanner console = new Scanner(System.in);
			int option;
			System.out.println("         Main Menu" );
			System.out.println("==============================" );

			System.out.println("Enter 1 for a file 2 for a URL : "  );
			 option=console.nextInt();
			switch (option)
			{
				case 1:
					 FileRunner.RunFile();// calls RunFile method from Runner Class
				break;
				case 2:
					 UrlRunner.RunUrl();// calls RunUrl method from UrlRunner Class
				break;
				
				default:
					System.out.println("Invalid Entry... Please Choose 1 or 2  "  );
					Menu();// calls menu method
					

			} // switch

		
		}// menu method

}// class


	




