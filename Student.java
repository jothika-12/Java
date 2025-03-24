package Programs;
import java.util.*;
public class Student {
	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        // HashMap to store student details
	        HashMap<String, HashMap<String, String>> studentMap = new HashMap<>();
	        System.out.println("Enter the Number of students to add:");
	        int n = s.nextInt();	
	        s.nextLine(); // Consume leftover newline
	        // Adding students
	        for (int i = 0; i < n; i++) {
	        	System.out.println("Enter the Id:");
	        	String id = s.nextLine();
	        	HashMap<String, String> studentDetails = new HashMap<>();
	        	System.out.println("Enter the name:");
	        	studentDetails.put("Name", s.nextLine());
	        	System.out.println("Enter the Grade:");
	        	studentDetails.put("Grade", s.nextLine());
	        	studentMap.put(id, studentDetails);
	        }
	        System.out.println("Student List: " + studentMap);
	        // Remove a student by ID
	        System.out.println("Enter the ID to remove the student:");
	        String idToRemove = s.nextLine();
	        if (studentMap.containsKey(idToRemove)) {
	        	HashMap<String, String> removedStudent = studentMap.remove(idToRemove);
	        	System.out.println("Removed Student: " + removedStudent);
	        } else {
	        	System.out.println("Student with ID " + idToRemove + " not found!");
	        }
	        System.out.println("Updated Student List: " + studentMap);
	        s.close();
	    }
	    }

