package demos;

public class IDCardPrinter {
	
	public static void main(String[] args) {
		System.out.println("Printing ID Card");
		
		//Declaring the variable
		String name;
		 
		
		//Defining the variable
		name = "Roger Williams";
		
		//Declare & Define variable
		String id = "ST05GH23";
		String state = "CA";
		String expDate = "12/2023";
		
		//Use the variable
		System.out.println(name);
		System.out.println(id);
		System.out.println(state);
		System.out.println(expDate);
		
		//Print ID Card
		System.out.println("NAME: " + name + ", ID: " + id + ", STATE: " + state + ", EXP. DATE: " + expDate + "");
	
	}
	

}
