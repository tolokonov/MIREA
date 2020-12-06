package com.company.pr_12.task_5;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("Необходимо ввести абсолютный путь файла в консоль");
        String fileName = "C:\\Users\\itolo\\IdeaProjects\\MIREA\\com\\company\\pr_12\\task_5\\File.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileReader(reader.readLine()));
        String www = scanner.nextLine();
        System.out.println(www);
        StringBuilder result = Order.getLine(www.split(" "));
        System.out.println(result.toString());
    }
}
