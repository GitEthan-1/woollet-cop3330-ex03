/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package ex03.base;

import java.util.Scanner;

/**
 * Exercise 3 - Printing Quotes
 * Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.
 *
 * Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
 *
 * Example Output
 *
 * What is the quote? These aren't the droids you're looking for.
 * Who said it? Obi-Wan Kenobi
 * Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 *
 * Constraints
 *
 * Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
 * If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
 *
 * Challenge
 *
 * Modify this program so that instead of prompting for quotes from the user,
 * you create a structure that holds quotes and their associated attributions and then display all of the quotes using the format in the example.
 * An array of maps would be a good choice.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the quote? ");
		String quote = in.nextLine();
		
		System.out.println("Who said it? ");
		String who = in.nextLine();
		
		System.out.println(who + " says, " + "\"" + quote + "\"");
		
	}
}
