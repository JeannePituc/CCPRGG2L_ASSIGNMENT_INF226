package java_;
import java.util.Scanner;

public class Assignment2 {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 150;

    public static void main(String[] args) throws Exception {

        System.out.print("Enter current weight in pounds (lbs): ");
        int weight = scan.nextInt();

        if (weight > 150) {
            loseWeight(weight);
        } else {
            System.out.println("Current weight must be greater than 150 lbs!");
        }
        scan.close();
    }
   
    static void loseWeight(int currentWeight) {
        
        
        System.out.println("Eating right!");
        System.out.println("Doing exercises!");

        
        currentWeight = checkWeight(currentWeight);
        
     // Define the base case by using an if condition. The target weight is 150 lbs
        if (currentWeight > 150) {
     // Do something to reach the target. Call the fixDietandExercise() method
            fixDietandExercise(currentWeight);
            
        } else if (currentWeight < 150) {
            System.out.println("Current weight must be greater than 150 lbs!");
     
    // if the target weight has been reached, print the code below.
    // System.out.println("I have reached my target weight!");
        } else {
        	   System.out.println("Yay! I have reached my target weight!");
       
    }
        }
   
    static int checkWeight(int weight) {
        System.out.println("Your current weight is: " + weight + " lbs");
        return weight;
        
    }

    static int fixDietandExercise(int weight) {
        
        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();
        

        int currentWeight = weight - weightlost;
        loseWeight(currentWeight);
        return currentWeight;
}
}