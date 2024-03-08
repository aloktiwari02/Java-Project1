package Project;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number: ");
        int num2 = scanner.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Choose option for calculation");
        int choose = scanner.nextInt();

        if(choose==1){
            int Result = num1+num2;
            System.out.println("Addition: "+Result);
        }
        else if(choose==2){
            int Result = num1-num2;
            System.out.println("Subtraction: "+Result);
        }
        else if(choose==3){
            int Result = num1*num2;
            System.out.println("Multiplication: "+Result);
        }
        else if(choose==4){
            if(num2==0){
                System.out.println("Can't divided by 0");
            }
            int Result = num1/num2;
            System.out.println("Division: "+Result);
        }
        else if(choose==5){
            System.out.println("Exit");
        }
        else{
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
