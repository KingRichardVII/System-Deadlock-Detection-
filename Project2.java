//Richard Phan
// COMP 322 FALL 2025
//Project2

import java.util.Scanner;

public class Project2 {
	//Global constants 
	public static final int EMPTY = 0; //None
	public static final int REQUEST = 1; //Process requested resource
	public static final int ALLOCATE = 2; //process allocated resource
	
	//global variables
	private static Scanner input = new Scanner(System.in);
	private static Relation[] process;
	
	//main method
	public static void main(String[] args) {
		//enter number of processes
		System.out.println("Enter the number of processes: ");
		if (!input.hasNextInt()){ //Date type check
			System.out.println("Invalid input.");
			System.exit(0);
		}
		int processes = input.nextInt();
		input.nextLine(); //Input flushing
		if (processes <= 0) { //Valid data check
			System.out.println("Invalid number of processes");
			System.exit(0);
		
		}
		//enter the number of resources
		System.out.println("Enter the number of resources: ");
		if (!input.hasNextInt()) { //Data Type Check
			System.out.println("Invalid input.");
			System.exit(0);
		}
		int resources = input.nextInt();
		input.nextLine();//input flush
		if (resources <= 0) { //Valid data check
			System.out.println("Invalid number of resources.");
			System.exit(0);
		
		}
		
		//Create the process-to-resource relations
		process = new Relation[processes]; //array
		for(int i = 0; i < process.length; i++){ 
			process[i] = new Relation(resources); //individual object
		}
		
		//main loop
		int option = 0; //Any value other than 4 (4 ends the program
		while (option !=4) {
			System.out.println();
			System.out.println("1) Print the hiearchy from table");
			System.out.println("2) Add a child process to hierarchy");
			System.out.println("3) Remove a process's descendants from the hierarchy");
			System.out.println("4) Quit the program");
			System.out.println("Enter Selection"); //case for invalid option, loop repeats harmlessly
			if (input.hasNextInt()) {//data type check
				option = input.nextInt();
			}else {
				option = 0; // any value other than 1,2,3,4
			}
			input.nextLine(); //input flushing
			switch (option) {
				case 1:
					printHiearchy();
					break;
				case 2:
					addProcess();
					break;
				case 3: 
					removeProcess();
					break;
				case 4: 
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Invalid option, try again");
			}//End of Switch Statement
		}//end of main loop
	}//end of main method

	}//end of main method
	
	/************
	Methods:
	*************/
	//print relations
	public static void printRelations(){
		//Print the header row
		for (int j = 0; j < process[0].getResourceLength(); j++){
			System.out.print("\tr" + j);
		}
		System.out.println();
		//Print every process to resource relation as a row
		for (int i = 0; i < process.length; i++) {
			System.out.print("p" + i);
			for (int j = 0; j < process[0].getResourceLength(); j++){
				System.out.print("\t");
				if (process [i].getResource(j) != 0){
				System.out.print(process[i].getResource(j));
				}
			} 
			System.out.println();
		}
	}// end of Print relations
	
	public static void changeRelation(){
	System.out.println("Print relations"); //FIXME delete
	}//end of change relation
	
	//detect deadlock
	public static void detectDeadlock(){
	System.out.println("Print relations");//FIXME delete
	}//end of detect deadlock
	
	//Detect deadlock recursively
	public static boolean detectDeadlockRecursively(int targetIndex, int currentIndex){
	System.out.println("Print relations"); //FIXME delete
	}//end of detect deadlock recursively
	
}// end of class 