package demos;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		//Determine if -7 is positive or negative

		int number=-7;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}