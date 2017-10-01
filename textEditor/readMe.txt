array based text processor project 2016  Ray Mannion g00340315   g00340315@gmit.ie   

In order to run this progam user must create a package named gmit.ie.java2
then drop the src file in to the folder and the java files will run

this program contain 5 java files: runner,FileRunner,Urlrunner,FileParser & UrlParser
by having 5 files in the program, i broke the program into 2 seperate programmes
one side looks after the file parsing and the other side looks after the url parsing 
the reason i choose to do it this way, was incase one part of the programme didn't work, the 
other side still would
the fileRunner and the urlRunner both contain a menu which allows the user to search through either 
the file or the url seperately
the main menu contains 2 options and when the user picks one it calls the method from the runner and allows then to search 

to start the program, first start the runner file
user is presented with a main menu. this menu tells the user to enter 1 to parse a file or 
2 to parse a url.
                                                     Main Menu"
			                  ==============================

					  Enter 1 for a file 2 for a URL : 



press 1 and the user is presented with a prompt to enter the name of the file(with .txt extension) they wish to parse.

		Enter the file you want to work on : (example.txt)


once they enter a file they are presented with a second menu.
this menu contains the various featues of the program.

                       ============================================================
        		1: See if a word appears     2: First Mention of a word
       			3: Last Mention of a word    4: Return size of the file
       			5: Delete a word from File   6: Find Occurance of a word
        		7: To parse another file  
        		8: Return to Main Menu  
                        Press 0 to close menu
      
      			Enter option: 


press 2 and the user is presented with a prompt to enter the name of the url(http://www.example.com) they wish to parse.

                Enter web site : (http://www.example.com)


once they enter a url they are presented with a second menu.
this menu contains the various featues of the program.
 		        ============================================================
        		  1: See if a word appars     2: First Mention of a word
                          3: Last Mention of a word   4: Return Size of the URL
        		  5: Delete a word from URL   6: Find Occurance of a word
                          7: To parse another URL
                          8: Return to Main Menu
      			  Press 0 to close menu
       
                          Enter option: 



the menu is contained within a while loop so the menu will continue to pop-up until the user enters 0
