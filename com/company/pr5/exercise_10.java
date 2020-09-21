package com.company;

class exercise_10 {

    public static int recursion(int n, int i) {
        if (n==0){
            return i;
        } else {
            return recursion(n / 10, i * 10 + n % 10);
        }
    }
}
