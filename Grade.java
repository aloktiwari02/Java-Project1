package Project;
import java.util.Scanner;

public class Grade {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Result of the Student");
        System.out.print("Enter the no. of Subjects: ");
        int numberofSubjects = scanner.nextInt();
        int marks;
        float total = 0;

        for(int i=0; i<numberofSubjects; i++){
            System.out.print("Enter the marks of Subject:");
            marks = scanner.nextInt();
            total = total + marks;
        }
        scanner.close();

        float avg = total/numberofSubjects;
        System.out.println("The Result is: ");

        if(avg>=40){
            System.out.print("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
