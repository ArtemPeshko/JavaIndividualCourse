package com.freeit.lesson2;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 22.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class TicTacToe {

    public static String[][] field = new String[3][3];
    public static String userSymbol = "X";
    public static String pcSymbol = "O";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean game = true;

        while (game) {
            System.out.println("Play Tic-Tac-Toe? Enter < Y > or < N > :");
            String play_game = scanner.next().toUpperCase(Locale.ROOT);
            if (!play_game.equals("N")) {
                Game();
            } else {
                game = false;
            }
        }
    }


    static void Symbols() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the symbol: 1 - < X >, 2 - < O >");
        String userVarSymbol = scanner.next();
        if (userVarSymbol.equals("1")) {
            userSymbol = "X";
            pcSymbol = "O";
        } else if (userVarSymbol.equals("2")) {
            userSymbol = "O";
            pcSymbol = "X";
        } else {
            System.out.println("Default symbol is < X >");
        }
    }

    static void ClearField() {
        int a = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = String.valueOf(a);
                a++;
            }
        }
    }

    static void PrintField() {
//        System.out.println("\n");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                if (j != 2) {
                    System.out.print(" | ");
                }
            }
            if (i != 2) {
                System.out.println("\n----------");
            }
        }
        System.out.println("\n");
    }

    static void UserStep() {
        Scanner scan = new Scanner(System.in);
        boolean emptyCell = true;
        boolean anyCell = true;
        while (emptyCell) {
            System.out.println("Please, enter number of cell: ");
            String cell = scan.next();
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (cell.equals(field[i][j])) {
                        field[i][j] = userSymbol;
                        emptyCell = false;
                        anyCell = false;
                    }
                }
            }
            if (anyCell) {
                System.out.println("This cell is busy. Select any cell.");
            }
        }
        PrintField();
    }

    static void PcStep() {
        boolean emptyCell = true;
        Random random = new Random();
        String cell = String.valueOf(random.nextInt(10));
        while (emptyCell) {
            for (int i = 0; i < field.length && emptyCell; i++) {
                for (int j = 0; j < field[i].length && emptyCell; j++) {
                    if (cell.equals(field[i][j])) {
                        field[i][j] = pcSymbol;
                        emptyCell = false;
                    } else {
                        cell = String.valueOf(random.nextInt(10));
                    }
                }
            }
        }
        PrintField();
    }

    static boolean IsWin(String symbol) {

        boolean isWin = false;
        if (field[0][0].equals(symbol)) {
            if (field[0][1].equals(symbol)) {
                if (field[0][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[0][0].equals(symbol)) {
            if (field[1][0].equals(symbol)) {
                if (field[2][0].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[2][2].equals(symbol)) {
            if (field[2][0].equals(symbol)) {
                if (field[2][1].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[2][2].equals(symbol)) {
            if (field[0][2].equals(symbol)) {
                if (field[1][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[1][1].equals(symbol)) {
            if (field[1][0].equals(symbol)) {
                if (field[1][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[1][1].equals(symbol)) {
            if (field[0][1].equals(symbol)) {
                if (field[2][1].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[1][1].equals(symbol)) {
            if (field[0][0].equals(symbol)) {
                if (field[2][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        if (field[1][1].equals(symbol)) {
            if (field[0][2].equals(symbol)) {
                if (field[2][0].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        return isWin;
    }

    static void Game() {
        int cellsLeft = 9;
        boolean nextStep = true;
        Symbols();
        ClearField();
        PrintField();
        while (nextStep) {
            if (cellsLeft > 0) {
                UserStep();
                cellsLeft--;
                if (IsWin(userSymbol)) {
                    System.out.println("Congratulation! You win!");
                    break;
                }
            } else {
                System.out.println("Draw! All cells is busy.");
                nextStep = false;
            }
            if (cellsLeft > 0) {
                System.out.println("PC turn: ");
                PcStep();
                cellsLeft--;
                if (IsWin(pcSymbol)) {
                    System.out.println("You lost. Try again!");
                    break;
                }
            } else {
                System.out.println("Draw! All cells is busy.");
                nextStep = false;
            }
        }
    }
}
