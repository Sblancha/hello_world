// a simple program to practice common Github commands 

import java.util.Scanner;

public class hello {

    public static void main(String [] args) {
	
		Scanner input = new Scanner(System.in);
	
		String name;
        System.out.println("Enter your name");
		name = input.next();
        System.out.println("Hello " + name + ", my name is Scott");

    }
}