/*
 *Assignment 04
 *Adam Farrar
 *farrarad@mail.uc.edu
 *IS 4010 App Dev w/ Java
 *Fall 2019
 *Description: Output pyramid of numbers
 *Citations: code4coding.com
 *
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 9;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j < lines; j++) {
				System.out.print(" ");
			}
			lines--;
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
