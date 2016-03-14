//https://www.youtube.com/watch?v=25kUc_ammbw
//http://stackoverflow.com/questions/8059259/creating-a-console-menu-for-user-to-make-a-selection


package oop_bookmart;
import java.util.Scanner;

public class UserMenu {
	
	boolean exit;
	//Student Student1 = new Student();
	
	public void displayMenu()
	{
		
		while(!exit)
		{
			printMenu();
			int choice = getInput();
			//System.out.println("Sending choice to case: " + choice);
			userCase(choice);
		}
	}
	
	private void printMenu()
	{
		System.out.println("User Menu");
		System.out.println("1. View User History");
		System.out.println("2. Search ISBN");
		System.out.println("3. View book inventory");
		System.out.println("4. Show student");
		System.out.println("0. Exit");
	}

	private int getInput()
	{
		//System.out.println("getting input");
		Scanner selection = new Scanner(System.in);
		int choice = -9;
		//System.out.println("Entering while loop\n");
		while (choice < 0 || choice > 4)
		{
			//System.out.println("in while loop");
			System.out.print("Enter selection: ");
			System.out.print("");
			choice = Integer.parseInt(selection.nextLine());
		} //while (choice != 0);
		
		//System.out.println("\nchoice after while" + choice);
		//selection.close();
		return choice;
	}
	
	private void userCase(int choice)
	{
		//System.out.println("In case, choice: "+ choice);
		
		switch(choice)
		{
		case 0:
			exit = true;
			System.out.println("Exiting\n");
			break;
			
		case 1:
			//View user's history
			System.out.print("View user history\n");
			viewHistory();
			break;
				
		case 2:
			//Search user
			System.out.print("Search ISBN\n");
			searchISBN();
			break;
			
		case 3:
			//View book inventory
			System.out.println("View book inventory\n");
			viewBookInv();
			break;
			
		case 4:
			showStudent();
		
		default:
			//Exit
			System.out.println("Exit program\n");
			break;
				
		}
	}
	
	public void viewHistory()
	{
		System.out.println("In viewHistory");
	}
	
	public void searchISBN()
	{
		System.out.println("In searchISBN");
	}
	
	public void viewBookInv()
	{
		System.out.println("In viewBookInv");
	}
	
	public void showStudent()
	{
		//Student1.toString();
	}
}
