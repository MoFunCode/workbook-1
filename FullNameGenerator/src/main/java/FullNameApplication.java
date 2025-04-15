import java.util.Scanner;

/*
* You will prompt the user to enter the parts of their name. You will then create a
new string that holds the user’s full name.
The user will always have a first and last name, they may also have a middle
name and a suffix (ex. Jr, PhD). If a user does not enter a value for the middle
name or suffix, the full name should not include that part of the name. If the user
has a suffix in their name, the full name should include a comma before the
suffix.

* Please enter your name
First name: Glen↵
Middle name: ↵
Last name: Williams↵
Suffix: ↵
Full name: Glen Williams
*
* */


public class FullNameApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine().trim();

        System.out.println("Enter your middle name: ");
        String middleName = sc.nextLine().trim();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine().trim();

        System.out.println("Enter your suffix: ");
        String suffix = sc.nextLine().trim();

        // Start with first name
        String fullName = firstName;

        // Add middle name if not blank
        if (!middleName.isBlank()) {
            fullName += " " + middleName;
        }

        // Add last name
        fullName += " " + lastName;

        // Add suffix if not blank
        if (!suffix.isBlank()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }
}
