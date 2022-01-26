/*Program for Calculating ASCII value of a character
Asking user to enter character
Store the charatcer in char variable and copy the character in integer
data type variable with typecasting and print the integer value
*/

import java.util.Scanner;
class Ascii {
	public static void main(String[] args) {
		char c;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		
		int i = c; //Typecsasting character type to integer type
		
		System.out.println("The ASCII value of "+c+" is: "+ i);
	}
}