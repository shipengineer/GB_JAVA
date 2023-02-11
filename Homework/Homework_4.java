package Homework;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Homework_4 {
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

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class Program {

// public static void main(String[] args) {

// MapPrinter mp = new MapPrinter();
// Ui ui = new Ui(mp, new ConsoleView());
// int[][] m = new int[10][10];

// mp.mapColor(m);
// ui.setWallBlock(10, m);

// // var mg = new MapGenerator();
// // System.out.println(
// // new MapPrinter().mapColor(
// // mg.getMap()));

// // var c = new Point2D(3, 3);
// // var lee = new WaveAlgorithm(mg.getMap());
// // lee.Colorize(c);

// // System.out.println(
// // new MapPrinter().rawData(
// // mg.getMap())

// // );

// // mg.map[c.x][c.y] = -2;
// // System.out.println();
// // System.out.println();
// // System.out.println(new MapPrinter().mapColor(mg.map));
// }
// }

// interface View {
// void print(String str);
// }

// class ConsoleView implements View {

// @Override
// public void print(String str) {
// System.out.println(str);
// }
// }

// class Ui {
// Scanner in = new Scanner(System.in);
// Point2D catPos = new Point2D(0, 0);
// ArrayList<Point2D> exitPos = new ArrayList<Point2D>();
// MapPrinter mapPrinter;
// View view;

// public Ui(MapPrinter printer, View view) {
// mapPrinter = printer;
// this.view = view;
// }

// public Point2D getCatPos() {
// return catPos;
// }

// public void setCatPosition() {
// catPos = new Point2D(in.nextInt(), in.nextInt());
// }

// public ArrayList<Point2D> getExitPos() {
// return exitPos;
// }

// public void setExitPos(int count) {
// for (int i = 0; i < count; i++) {
// exitPos.add(new Point2D(in.nextInt(), in.nextInt()));
// }
// }

// public void setWallBlock(int count, int[][] map) {
// for (int i = 0; i < count; i++) {
// view.print(mapPrinter.mapColor(map));

// view.print("РЎС‚РµРЅР° " + i);
// Point2D exit = new Point2D(in.nextInt(), in.nextInt());
// map[exit.x][exit.y] = -1;
// }
// }

// }

// class Point2D {
// int x, y;

// public void setX(int x) {
// this.x = x;
// }

// public void setY(int y) {
// this.y = y;
// }

// public Point2D(int x, int y) {
// this.x = x;
// this.y = y;
// }

// public int getX() {
// return x;
// }

// public int getY() {
// return y;
// }

// @Override
// public String toString() {
// return String.format("x: %d y: %d", x, y);
// }

// @Override
// public boolean equals(Object obj) {
// Point2D t = (Point2D) obj;
// return this.x == t.x && this.y == t.y;
// }
// }

// class MapGenerator {
// int[][] map;

// public MapGenerator() {
// int[][] map = {
// { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
// { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
// { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
// { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
// { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
// { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
// };

// this.map = map;
// }

// public int[][] getMap() {
// return map;
// }

// public void setCat(Point2D pos) {
// map[pos.x][pos.y] = -2;
// }

// public void setExit(Point2D pos) {
// map[pos.x][pos.y] = -3;
// }
// }

// class MapPrinter {

// public String rawData(int[][] map) {
// StringBuilder sb = new StringBuilder();

// for (int row = 0; row < map.length; row++) {
// for (int col = 0; col < map[row].length; col++) {
// sb.append(String.format("%5d", map[row][col]));
// }
// sb.append("\n");
// }
// for (int i = 0; i < 3; i++) {
// sb.append("\n");
// }

// return sb.toString();
// }

// public String mapColor(int[][] map) {
// StringBuilder sb = new StringBuilder();

// for (int row = 0; row < map.length; row++) {
// for (int col = 0; col < map[row].length; col++) {
// switch (map[row][col]) {
// case 0:
// sb.append("рџ”¶");
// break;
// case -1:
// sb.append("рџ”ґ");
// break;
// case -2:
// sb.append("рџђ€");
// break;
// case -3:
// sb.append("E");
// break;
// default:
// sb.append(" ");
// break;
// }
// }
// sb.append("\n");
// }
// for (int i = 0; i < 3; i++) {
// sb.append("\n");
// }
// return sb.toString();
// }
// }

// class WaveAlgorithm {
// int[][] map;

// public WaveAlgorithm(int[][] map) {
// this.map = map;
// }

// public void Colorize(Point2D startPoint) {
// Queue<Point2D> queue = new LinkedList<Point2D>();
// queue.add(startPoint);
// map[startPoint.x][startPoint.y] = 1;

// while (queue.size() != 0) {
// Point2D p = queue.remove();

// if (map[p.x - 1][p.y] == 0) {
// queue.add(new Point2D(p.x - 1, p.y));
// map[p.x - 1][p.y] = map[p.x][p.y] + 1;
// }
// if (map[p.x][p.y - 1] == 0) {
// queue.add(new Point2D(p.x, p.y - 1));
// map[p.x][p.y - 1] = map[p.x][p.y] + 1;
// }
// if (map[p.x + 1][p.y] == 0) {
// queue.add(new Point2D(p.x + 1, p.y));
// map[p.x + 1][p.y] = map[p.x][p.y] + 1;
// }
// if (map[p.x][p.y + 1] == 0) {
// queue.add(new Point2D(p.x, p.y + 1));
// map[p.x][p.y + 1] = map[p.x][p.y] + 1;
// }
// }
// }

// public ArrayList<Point2D> getRoad(Point2D exit) {
// ArrayList<Point2D> road = new ArrayList<>();
// ///
// return road;
// }
// }