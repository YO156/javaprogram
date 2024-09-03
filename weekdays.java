package yoga;
import java.util.Scanner;

public class dd {
	

	
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            // Prompt the user to enter the day number
	            System.out.print("Enter the week days: ");
	            
	            // Check if the input is an integer
	            if (!scanner.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                return;
	            }

	            int day = scanner.nextInt();

	            // Determine which week the entered day falls into
	            if (day >= 1 && day <= 7) {
	                System.out.println("The day " + day + "  first week.");
	            } else if (day >= 8 && day <= 14) {
	                System.out.println("The day " + day + "  second week.");
	            } else if (day >= 15 && day <= 21) {
	                System.out.println("The day " + day + "  third week.");
	            } else if (day >= 22 && day <= 30) {
	                System.out.println("The day " + day + " fourth week.");
	            } else {
	                System.out.println("Invalid day number.");
	            }
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
