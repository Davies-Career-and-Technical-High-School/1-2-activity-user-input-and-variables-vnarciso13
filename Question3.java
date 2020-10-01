/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
String name;
System.out.println("Hi there. What is your name?");
name = scan.nextLine();

String adjective;
System.out.println("What adjective describes you?");
adjective = scan.nextLine();
System.out.println("My name is " + name + ". " + "I am " + adjective + ".");

    }
}