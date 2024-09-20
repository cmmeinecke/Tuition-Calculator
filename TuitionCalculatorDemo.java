import java.util.Scanner;

//Create TuitionCalculatorDemo to test the TuitionCalculator class
public class TuitionCalculatorDemo {
    public static void main(String[] args) {

        //create scanner keyboard to get input data from user
        Scanner keyboard = new Scanner(System.in);

        // allows user to input student name
        System.out.print("Student name: ");
        String studentName = keyboard.nextLine();

        //allows user to input number of credits
        System.out.print("How many credit hours is the student taking? ");
        int creditHours = keyboard.nextInt();

        //allows user to input credit price
        System.out.print("What is the price per credit hour? ");
        double creditPrice = keyboard.nextDouble();

        //close keyboard
        keyboard.close();

        // Create an object of the TuitionCalculator class
        TuitionCalculator calculator = new TuitionCalculator(studentName, creditHours, creditPrice);

        // Display the tuition information using getter methods from the TuitionCalculator class
        System.out.println("Tuition Calculator");

        //line separator
        System.out.println("-----------------------------");

        //displays the student's name
        System.out.println("Student name: " + calculator.getStudentName());

        //displays the number of credits input
        System.out.println("Number of Credits: " + calculator.getCreditHours());

        //displays the price of the credit
        System.out.println("Price per Credit: " + calculator.getCreditPrice());

        //displays the calculation for the tuition cost rounded to the hundredths place
        System.out.printf("The total cost of tuition for " + calculator.getStudentName() + " is: $%.2f%n",
                            calculator.calculateTuition());
    }
}