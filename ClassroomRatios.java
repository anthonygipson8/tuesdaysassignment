package demos;

public class ClassroomRatios {

	public static void main(String[] args) {
		// Percentage of girls: Number of girls/total students
		// The Student Teacher ratio: Total Students/ Teacher and Assistant (2)
	
		// Define the variables
		int numberOfGirls = 16;
		int totalStudents = 27;
		float girlPercentage = (numberOfGirls * 100.0f) / totalStudents;
		int teacherAssistant = 2;
		float studentTeacherRatio = (totalStudents * 1.0f) / teacherAssistant;
		
		
		System.out.println(girlPercentage + "% of the class are girls");
		System.out.println("The Student-Teacher ratio is " + studentTeacherRatio + "");		
	

	}

}
