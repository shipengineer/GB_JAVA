package Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Homework_2 {

    public static void main(String[] args) {
        pow();
    }

    public static void pow() {

        // чтение файла
        String varies = null;
        try {
            varies = readFile("input.txt", StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // извлечение переменных
        String[] array_string = varies.split("\n");
        int IndexOfA = find(array_string, "a");
        int IndexOfB = find(array_string, "b");
        int a = Integer.parseInt(array_string[IndexOfA].split(" ")[1].trim());
        int b = Integer.parseInt(array_string[IndexOfB].split(" ")[1].trim());

        // Расчет результата
        int result = b;
        for (int i = 1; i < a; i++) {
            result *= b;
        }

        // Запись результата
        try (FileWriter output = new FileWriter("output.txt")) {
            if (result == -1) {
                output.append("Неисправный входной файл");
            } else {
                output.append(Integer.toString(result));
            }

        } catch (IOException ex) {
            System.out.println("not found");
        }
    }

    public static String readFile(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }

    public static Integer find(String[] Array, String WTFind) {
        int WTIndex = -1;
        for (String item : Array) {
            if (item.indexOf(WTFind) == 0) {
                WTIndex = Arrays.asList(Array).indexOf(item);
            }
        }

        return WTIndex;
    }
}
