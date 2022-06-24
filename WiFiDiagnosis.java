/*
 *Class: CMSC203 CRN XXXX
 Program: Assignment 1
 Instructor: 
 Summary of Description: Ask the user questions to solve their Internet problem using if and else if statements
 Due Date: 6/23/2022 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.

 */
import java.util.Scanner; 
/**
 * 
 * @author Geronimo Restrepo
 *
 */

public class WiFiDiagnosis 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in); 
		String choice; 
		String no = "No"; 
		String yes = "Yes"; 
		
		//Step 1
		System.out.println("First step: reboot your computer"); 
		System.out.println("Are you able to connect with the internet? (yes or no)");
		choice = sc.nextLine();
		if(choice.equalsIgnoreCase(yes))
		{
			System.out.println("Rebooting your computer seemed to work");
		}
		
		//step 2
		else if(choice.equalsIgnoreCase(no)) {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");		
		}
		choice = sc.nextLine();
		if(choice.equalsIgnoreCase(yes))
		{
			System.out.println("Rebooting your router seemed to work");
		}
		
		//Step 3
		else if(choice.equalsIgnoreCase(no))
		{
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		choice = sc.nextLine(); 
		if(choice.equalsIgnoreCase(yes))
		{
			System.out.println("Checking the router's cables seemed to work");
		}
		
		//Step 4
		else if(choice.equalsIgnoreCase(no))
		{
			System.out.println("Fourth step: move the computer closer to the router and try to connect ");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		choice = sc.nextLine();
		if(choice.equalsIgnoreCase(yes))
		{
			System.out.println("Moving your computer closer to the router seemed to work");
		}
		else if(choice.equalsIgnoreCase(no))
		{
			System.out.println("Fifth step: Contact your ISP" + "\nMake sure your ISP is hooked up to your router."); 
		}
	}
}
