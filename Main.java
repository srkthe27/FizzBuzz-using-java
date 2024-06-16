import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Reading values
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int number = scanner.nextInt();

        //condition
        if ((number%5 == 0) && (number%3 == 0) )
            System.out.println("FizzBuzz");
        else if (number%5 == 0)
            System.out.println("Fizz");
        else if (number%3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}