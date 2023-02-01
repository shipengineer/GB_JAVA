package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        System.out.println(Paths(Input_Maze(), Input_Figure()));

    }

    // ввод массива
    public static int[][] Input_Maze() {
        System.out.println("Введите количестов рядов");
        Scanner line = new Scanner(System.in);
        int m = line.nextInt();
        System.out.println("Введите количестов столбцов");
        int n = line.nextInt();
        int[][] maze = new int[m][n];
        return maze;

    }

    // установка фигуры
    public static int[] Input_Figure() {
        System.out.println("Введите где стоит фигура по ИКСУ");
        Scanner line = new Scanner(System.in);
        int x = line.nextInt();
        System.out.println("где стоит фигура по ИГРЕКУ");
        int y = line.nextInt();
        int[] figure = new int[] { x, y };
        line.close();
        return figure;
    }

    // расчет ходов
    public static long Paths(int[][] maze, int[] figure) {
        for (int i = figure[0]; i < maze[0].length; i++) {
            maze[figure[0]][i] = 1;
        }
        for (int i = figure[1]; i < maze[1].length; i++) {
            maze[i][figure[1]] = 1;
        }
        for (int i = figure[0] + 1; i < maze[0].length; i++) {
            for (int j = figure[1] + 1; j < maze[1].length; j++) {
                maze[i][j] = maze[i - 1][j] + maze[i][j - 1];
            }
        }
        long path = maze[maze[0].length - 1][maze[1].length - 1];

        return path;
    }

    // Печать массива
    public static void PrintArray(int[][] maze) {
        for (int i[] : maze) {
            System.out.println(Arrays.toString(i));

        }
    }

}
