import java.util.Scanner;
/* this program take user input and do basic calculation
 * user first input an number from 1-6 to indicate what operation they want to perform
 * then input two integer number 
 * the program will print result for the calculation performed
 */

public class Calculator {
    // add method takes integer a and b 
    // returns the sum of a and b as result
    public static int add(int a, int b){
        return a + b;
    }

    // sub method takes integer a and b
    // returns the result of a subtract b 
    public static int sub(int a, int b){
        return a - b;
    }

    // multiply method takes integer a and b
    // returns the result of a multiplies b 
    public static int multiply(int a, int b){
        return a * b;
    }

    // divide method takes integer a and b
    // returns the result of a divides b 
    // the divide method will perform integer division and returns an integer as result
    public static int divide(int a, int b){
        return a / b;
    }

    // modulus method takes integer a and b
    // returns the result of a mod b 
    public static int modulus(int a, int b){
        return a % b;
    }

    // showResult method will print the result to user
    public static void showResult(int result){
        System.out.print("The result is ");
        System.out.println(result);
    }

    public static void main(String[] args) {
        // take user input
        Scanner scan = new Scanner(System.in);
        // init select option as 0
        int select = 0;
        // init user input a, b, and init result 
        int a, b, result;

        // while user input is not 6, keep looping
        while (select != 6) {
            // print prompt for user to enter the selected option
            System.out.println("Programmer's Integer Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Quit");
            System.out.print("Enter the number of the operation you want to do: ");
            // get user option for calculation
            select = scan.nextInt();
            
            switch (select) {
                // when user select 1, do addition
                case 1:
                    // prompt user to enter 2 numbers
                    System.out.print("Enter the two number: ");
                    // take first user input number
                    a = scan.nextInt();
                    // take second user input number
                    b = scan.nextInt();
                    // perform addition and show result
                    showResult(add(a, b));
                    break;

                // when user select 2, do substraction
                case 2:
                    // prompt user to enter 2 numbers
                    System.out.print("Enter the two number: ");
                    // take first user input number
                    a = scan.nextInt();
                    // take second user input number
                    b = scan.nextInt();
                    showResult(sub(a, b));
                    break;

                // when user select 3, do multiplication
                case 3:
                    // prompt user to enter 2 numbers
                    System.out.print("Enter the two number: ");
                    // take first user input number
                    a = scan.nextInt();
                    // take second user input number
                    b = scan.nextInt();
                    showResult(multiply(a, b));
                    break;
                // when user select 4, do division
                case 4:
                    // prompt user to enter 2 numbers
                    System.out.print("Enter the two number: ");
                    // take first user input number
                    a = scan.nextInt();
                    // take second user input number
                    b = scan.nextInt();
                    showResult(divide(a, b));
                    break;

                // when user select 5, do modulus
                case 5:
                    // prompt user to enter 2 numbers
                    System.out.print("Enter the two number: ");
                    // take first user input number
                    a = scan.nextInt();
                    // take second user input number
                    b = scan.nextInt();
                    showResult(modulus(a, b));
                    break;

                // when user select 6, print "Bye!" and quit the program
                case 6:
                    System.out.println("Bye!");
                    break;
                // when user enter an number other than 1-6, prompt error message
                default:
                    System.out.println("You entered an invalid number");
                    break;
            }
            System.out.println("======================================================");
        }
    }
}
