import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email address: ");
        String studentEmail = scan.nextLine();

    
        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }
        
       
        System.out.print("Enter a cellphone number: ");
        String phoneNum = scan.nextLine();

    
        Pattern pattern1 = Pattern.compile("\\+639\\d{9}");
        Matcher matcher1 = pattern1.matcher(phoneNum);

        boolean match1 = matcher1.matches();

        if (match1) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");

        }
        System.out.print("Enter a birthday: ");
        String birthday = scan.nextLine();

    
        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher2 = pattern1.matcher(birthday);

        boolean match2 = matcher1.matches();

        if (match2) {
            System.out.println("valid birthday");
        } else {
            System.out.println("invalid birthday");

    }
}
}