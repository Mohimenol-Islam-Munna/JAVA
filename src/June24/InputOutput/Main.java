package June24.InputOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("This is output by print method without new line at the end.\n");

        System.out.println("This is output by println method with new line at the end.");

        System.out.printf("Formatted output by printf method : %d \n", 10);


        // User Input

        // Create Instance of Scanner Class
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name : ");

        String userName = input.nextLine();

        System.out.print("Please enter your address : ");

        String address = input.next();

        System.out.println("User Name :" + userName);

        System.out.println("User address : " + address);
    }
}
