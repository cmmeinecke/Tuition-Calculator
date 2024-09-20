/* PROGRAM: TuitionCalculator
 @Author  caitlin.meinecke
 This program calculates a given student's tuition
*/

/* Create TuitionCalculator class with private fields for a student's name,
credit hours, and the credit price*/
public class TuitionCalculator {
    private String studentName;         //hold student's name
    private int creditHours;            //holds credit hours
    private double creditPrice;         //holds credit price

    // No-argument constructor to initialize the private fields
    public TuitionCalculator() {
        this.studentName = "John Doe";
        this.creditHours = 12;
        this.creditPrice = 375.0;
    }

    // Create constructor to accept parameters for studentName, creditHours, and creditPrice
    public TuitionCalculator(String studentName, int creditHours, double creditPrice) {
        this.studentName = studentName;
        this.creditHours = creditHours;
        this.creditPrice = creditPrice;
    }

    // Getter method for studentName
    public String getStudentName() {
        return studentName;
    }

    //Getter method for creditHours
    public int getCreditHours() {
        return creditHours;
    }

    //Getter method for creditPrice
    public double getCreditPrice() {

        return creditPrice;
    }

    // Setter method for studentName
    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    //Setter method for creditHours
    public void setCreditHours(int creditHours) {

        this.creditHours = creditHours;
    }

    //Setter method for creditPrice
    public void setCreditPrice(double creditPrice) {

        this.creditPrice = creditPrice;
    }

    // Method to calculate tuition by multiplying creditHours by creditPrice
    public double calculateTuition() {

        return creditHours * creditPrice;
    }

    // Method to display output information for the studentName, creditHours, creditPrice, and tuition cost
    public void displayTuitionCalculator() {
        System.out.println("Tuition Calculator");                       //displays program name
        System.out.println("-----------------------------");               //line separator
        System.out.println("Student name: " + getStudentName());        //displays student name
        System.out.println("Number of Credits: " + getCreditHours());   //displays credit hours
        System.out.println("Price per Credit: " + getCreditPrice());    //displays credit price

        //displays student's name and the calculation for the cost of tuition
        System.out.printf("The total cost of tuition for " + getStudentName() + " is: $%.2f%n", calculateTuition());
    }
}
