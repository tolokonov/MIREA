package com.company;

class exercise_9 {

    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }

        if (a == 0 || b == 0) {
            return 1;
        }

        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
}
