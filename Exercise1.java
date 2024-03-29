package java_;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {



		        Scanner scan = new Scanner(System.in);
		        Pattern pattern = null;
		        Matcher match = null;
		        boolean isValid = false;
		        
		        System.out.println("1. Website Address Validation");

		        String website = scan.nextLine();

		        pattern = Pattern.compile("^www.([\\da-zA-Z\\W]+)\\.com$");

		        match = pattern.matcher(website);

		        isValid = match.matches();

		        if (isValid) {
		            System.out.println("Valid!");
		        } else {
		            System.out.println("Invalid!");
		        }
		        
		        
		        System.out.println("2. 24 hour time (HH:MM:SS) Validation");


		        String time = scan.nextLine();

		        pattern = Pattern.compile("[0-24]{2}:[0-59]{2}:[0-59]{2}");

		        match = pattern.matcher(time);

		        isValid = match.matches();

		        if (isValid) {
		            System.out.println("Valid!");
		        } else {
		            System.out.println("Invalid!");
		        }

		      
		        System.out.println("3. Finding specific files.");

		        String myfiles = "myfile.txt, thesis.xlsx, this is not a file, picture.jpg, selfie.png";

		        pattern = Pattern.compile(".+(.jpg|.png|.xlsx|.txt)$");
		        match = pattern.matcher(myfiles);

		        boolean found = false;
		        
		        while (match.find()) {
		            System.out.println("I found the text " + match.group());
		        found = true;
		        }
		        if (!found) {
		            System.out.println("No files found.");
		        }

		        System.out.println("4. Password Validation");


		        String password = scan.nextLine();

		        
		        pattern = Pattern.compile("^(?=.+\\w)(?=.+\\W)(?=.[^ELIZR]).{10,}$");

		        match = pattern.matcher(password);

		        isValid = match.matches();

		        if (isValid) {
		            System.out.println("Password is valid! ");
		        } else {
		            System.out.println("Password is invalid! ");
		        }

		        System.out.println("5. Replacing Text");
		        String phonenumbers = "+6391512345456, 0917123561234, +639190011223, 0915456213461";

		      
		        phonenumbers = phonenumbers.replaceAll("09", "+639");

		        System.out.println(phonenumbers);

		        scan.close();
		    }
		}
	