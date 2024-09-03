package yoga;
import java.util.Scanner;

public class menu {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marital status (married/unmarried): ");

        String maritalStatus = scanner.next().toLowerCase();



        if (maritalStatus.equals("m")) {

            System.out.println("Eligible for Insurences .");

        } else if (maritalStatus.equals("u")) {

         

            System.out.print("Enter gender (male/female): ");

            String gender = scanner.next().toLowerCase();



            System.out.print("Enter age: ");

            int age = scanner.nextInt();



            

            if (gender.equals("m") && age >30) {

                System.out.println("Eligible for the Insurences.");

            } else if (gender.equals("f") && age>20) {

                System.out.println("Eligible for the Insurences.");

            } else {

                System.out.println("Not eligible for the Insurences.");

            }

        } else {

            System.out.println("Invalid marital status entered.");

        }



        

        scanner.close();

    }

}




