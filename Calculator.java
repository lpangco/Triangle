import java.util.Scanner;

class Calculator {

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b){
        return a % b;
    }

    public static void showResult(int result){
        System.out.print("The result is ");
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int select = 0;
        int a, b, result;


        while (select != 6) {
            System.out.println("Programmer's Integer Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Quit");
            System.out.print("Enter the number of the operation you want to do: ");
            select = scan.nextInt();
            
            switch (select) {
                case 1:
                    System.out.print("Enter the two number: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    showResult(add(a, b));
                    break;
                case 2:
                    System.out.print("Enter the two number: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    showResult(sub(a, b));
                    break;
                case 3:
                    System.out.print("Enter the two number: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    showResult(multiply(a, b));
                    break;
                case 4:
                    System.out.print("Enter the two number: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    showResult(divide(a, b));
                    break;
                case 5:
                    System.out.print("Enter the two number: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    showResult(modulus(a, b));
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You entered an invalid number");
                    break;
            }
            System.out.println("======================================================");
        }
    }
}
