package com.freeit;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 19.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class GameColdOrHot {
    public static void main(String[] args) {
        int randomLetterIndex = (char) (97 + (char)(Math.random() * (122 - 97) + 1));
        System.out.println(randomLetterIndex);

        Scanner console = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter a letter");
            int consoleLetterIndex = console.nextLine().charAt(0);
            System.out.println(consoleLetterIndex);

            if (randomLetterIndex == consoleLetterIndex){
                System.out.println("You win!");
                exit = true;
                System.out.println("End Game!");
            } else if (randomLetterIndex - consoleLetterIndex < 4 && randomLetterIndex - consoleLetterIndex > -4) {
                System.out.println("Hot");
            } else if (randomLetterIndex - consoleLetterIndex < 6 && randomLetterIndex - consoleLetterIndex > -6) {
                System.out.println("Warmly");
            } else if (randomLetterIndex - consoleLetterIndex < 8 && randomLetterIndex - consoleLetterIndex > -8) {
                System.out.println("Chilly");
            } else {
                System.out.println("Cold");
            }
        }
    }
}