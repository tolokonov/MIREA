package com.company.pr_12.task_5;

import java.util.*;

public class Order {
    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }
        if ("".equals(words[0]) || words.length == 1) {
            return new StringBuilder(words[0]);
        }

        StringBuilder result = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i ++)
            if (!words[i].equals(""))
                list.add(words[i]);
        while (!isOK(list)) {
            Collections.shuffle(list);
        }
        for (String s : list)
            result.append(s+ " ");
        result.deleteCharAt(result.length()-1);
        return result;
    }
    public static boolean isOK(ArrayList<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            String first = list.get(i);
            String second = list.get(i+1);
            first = first.toLowerCase();
            second =second.toLowerCase();
            if (first.charAt(first.length()-1)!=second.charAt(0))
                return false;
        }
        return true;
    }
}