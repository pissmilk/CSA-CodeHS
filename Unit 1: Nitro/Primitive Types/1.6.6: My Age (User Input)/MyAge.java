import java.util.Scanner;
//Refer to your code from the previous My Age exercise. 
// Modify it using the Scanner class to take user input instead of hard coding in your age. 

public class MyAge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("Please enter your current age:");
        int age = input.nextInt();
        System.out.println("My current age is: " + age + "\nMy age next year will be: " + ++age + "\nMy current age is: " + --age);
    }
}
