/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String noun;
        String verb;
        String adjective;
        String adverb;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        verb = scanner.nextLine();

        System.out.println("Enter a adjective: ");
        adjective = scanner.nextLine();

        System.out.println("Enter a adverb: ");
        adverb = scanner.nextLine();

        scanner.close();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}