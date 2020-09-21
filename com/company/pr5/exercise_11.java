package com.company.pr5;

import java.util.Scanner;

public class exercise_11 {

    public static int recursion() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int n = scanner.nextInt();

        if (n == 1) {
            i++;
            int m = scanner.nextInt();

            if (m == 1) {
                i++;
                return recursion() + i;
            } else if (m == 0){
                int k = scanner.nextInt();
                if (k == 1) {
                    i++;
                    return recursion() + i;
                } else if (k==0){
                    return i;
                } else {
                    return recursion() + i;
                }
            } else {
                return recursion() + i;
            }
        } else if (n==0){
            int m = scanner.nextInt();

            if (m == 1) {
                i++;
                return recursion() + i;
            } else if (m == 0){
                return i;
            } else {
                return recursion() + i;
            }
        } else {
            return recursion() + i;
        }
    }
}
