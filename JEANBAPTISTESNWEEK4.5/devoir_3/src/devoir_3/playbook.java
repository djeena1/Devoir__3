package devoir_3;

import java.util.Scanner;

public class playbook
{
	public static void main(String[] args) 
	{
		System.out.println("Choose one option in this menu");
		System.out.println("1. Write a program to find out duplicate characters in a string.\n" + 
				"2. Write a program to find top two maximum numbers in a array.\n" + 
				"3. Write a program to sort a map by value.\n" + 
				"4. Write a program to find common elements between two arrays.\n" + 
				"5. How to swap two numbers without using temporary variable?\n" + 
				"6. Write a program to print fibonacci series.\n" + 
				"7. Write a program to find sum of each digit in the given number using recursion.\n" + 
				"8. Write a program to check the given number is a prime number or not?\n" + 
				"9. Write a program to find the given number is Armstrong number or not?\n" + 
				"10. Write a program to convert binary to decimal number.");
		
		Scanner src=new Scanner(System.in);
		int choix=src.nextInt();
		while(choix<1 || choix>10)
		{
			System.out.println("There isn't an option for "+choix+ " choose another one");
			choix=src.nextInt();
		}
		
		switch(choix)
		{
			case 1:
				functions.repeated();
				break;
			case 2:
				functions.max();
				break;
			case 3:
				functions.map();
				break;
			case 4:
				functions.commun();
				break;
			case 5:
				functions.swap();
				break;
			case 6:
				functions.fibonacci();
				break;
			case 7:
				functions.somme_chiffre();
				break;
			case 8:
				functions.nombre_premier();
				break;
			case 9:
				functions.armstrong();
				break;
			case 10:
				functions.bin_to_dec();
				break;
		}
		
	}

}
