import java.util.Scanner;

public class JavaAssignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input the first string from the user
        String firstString = scan.nextLine();

       // Input the second string from the user 
        String secondString = scan.nextLine();

        // printing the lengths of both the string 
        System.out.println("The length of the first string is " + firstString.length()+"\n");
        System.out.println("The length of the second string is " + secondString.length()+"\n");

        // Check if lengths of the strings match or not
        if (firstString.length() == secondString.length()) {
            System.out.println("The length of the two strings are the same");
        } else {
            System.out.println("The length of the two strings are not the same");
        }

        // Checking if strings are the same or not
        if (firstString.equals(secondString)) {
            System.out.println("The two strings are the same.");
        } else {
            System.out.println("Two strings are not equal");
        }

        scan.close();
    }
}
