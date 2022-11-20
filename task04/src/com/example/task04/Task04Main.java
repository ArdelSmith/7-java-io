package com.example.task04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        //Scanner scanner = new Scanner(new File("C:\\Users\\Adelith\\IdeaProjects\\7-java-io\\task04\\src\\com\\example\\task04\\input.test")).useLocale(Locale.ENGLISH);
        double sum = 0d;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }
        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }
}
