package Homework;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lesson30012023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество рядов, пожалуйста: ");
        int n = input.nextInt();
        System.out.println("Количество строк, пожалуйста: ");
        int m = input.nextInt();

        int[][] labirint = new int[n][m];
        labirint[3][0] = -1;
        labirint[5][4] = -1;

        System.out.println("В каком ряду начало: ");
        int x_start = input.nextInt();
        System.out.println("В какой строке начало: ");
        int y_start = input.nextInt();
        System.out.println("В какой ряду конец: ");
        int x_finish = input.nextInt();
        System.out.println("В каком строке конец: ");
        int y_finish = input.nextInt();
        int x = x_start;
        int y = y_start;
        labirint[x][y] = 1;
        Queue<int[]> queueOfNext = new LinkedList<int[]>();
        int[] start = new int[] { x, y };
        queueOfNext.add(start);

        int[][] first_step = Send_Drones(x, y, x_finish, y_finish, labirint);
        System.out.println("Строю лабиринт");
        PrintArray(first_step);
        System.out.println("Теперь отображаю путь");
        int[][] second_step = CallItBack(x_start, y_start, x_finish, y_finish, first_step);
        PrintArray(second_step);

    }

    // метод поиска пути алгоритмом Ли
    public static int[][] Send_Drones(int x, int y, int x_finish, int y_finish, int[][] labirint) {
        Queue<int[]> queueOfNext = new LinkedList<int[]>();
        int[] start = new int[] { x, y };
        boolean finish = false;
        queueOfNext.add(start);
        // скан в четырех направлениях
        while (labirint[x_finish][y_finish] == 0 && finish == false) {

            if (queueOfNext.peek() != null) {
                x = queueOfNext.peek()[0];
                y = queueOfNext.poll()[1];
                if (x > 0 && y > 0 && x < labirint[0].length - 1 && y < labirint[1].length - 1) {
                    for (int i = 1; i < 5; i++) {
                        switch (i) {
                            case 1:
                                if (labirint[x][y + 1] == 0) {
                                    labirint[x][y + 1] = labirint[x][y] + 1;
                                    int[] next = new int[] { x, y + 1 };

                                    queueOfNext.add(next);
                                }
                                break;
                            case 2:
                                if (labirint[x + 1][y] == 0) {
                                    labirint[x + 1][y] = labirint[x][y] + 1;
                                    int[] next = new int[] { x + 1, y };
                                    queueOfNext.add(next);
                                }
                                break;

                            case 3:
                                if (labirint[x][y - 1] == 0) {
                                    labirint[x][y - 1] = labirint[x][y] + 1;
                                    int[] next = new int[] { x, y - 1 };
                                    queueOfNext.add(next);
                                }
                                break;
                            case 4:
                                if (labirint[x - 1][y] == 0) {
                                    labirint[x - 1][y] = labirint[x][y] + 1;
                                    int[] next = new int[] { x - 1, y };
                                    queueOfNext.add(next);
                                }
                                break;
                            default:
                                break;
                        }
                    }

                }

            } else {
                finish = true;
            }

            // PrintArray(labirint);
        }
        return labirint;
    }

    public static int[][] CallItBack(int x_start, int y_start, int x_finish, int y_finish, int[][] labirint) {
        int x = x_finish;
        int y = y_finish;
        Queue<int[]> queueOfReverse = new LinkedList<int[]>();
        int hodov = 1;
        while (labirint[x][y] != 1) {
            hodov++;
            // System.out.println(String.join("|", Integer.toString(x),
            // Integer.toString(y)));
            // System.out.println(labirint[x][y]);
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        if (labirint[x][y] - labirint[x][y + 1] == 1) {

                            int[] previous = new int[] { x, y + 1 };
                            queueOfReverse.add(previous);
                            y++;
                        }
                        break;
                    case 1:
                        if (labirint[x][y] - labirint[x + 1][y] == 1) {
                            int[] previous = new int[] { x + 1, y };
                            queueOfReverse.add(previous);
                            x++;
                        }
                        break;

                    case 2:
                        if (labirint[x][y] - labirint[x][y - 1] == 1) {
                            int[] previous = new int[] { x, y - 1 };
                            queueOfReverse.add(previous);
                            y--;
                        }
                        break;
                    case 3:
                        if (labirint[x][y] - labirint[x - 1][y] == 1) {
                            int[] previous = new int[] { x - 1, y };
                            queueOfReverse.add(previous);
                            x--;
                        }
                        break;
                    default:
                        break;
                }
            }
        }

        while (queueOfReverse.peek() != null) {
            x = queueOfReverse.peek()[0];
            y = queueOfReverse.poll()[1];
            labirint[x][y] = 101;
        }
        System.out.println("Потребовалось " + hodov + " ходов");
        return labirint;

    }

    // Печать массива
    public static void PrintArray(int[][] maze) {
        for (int i[] : maze) {
            System.out.println(Arrays.toString(i));

        }
        System.out.println("________________________________________");
    }
}
