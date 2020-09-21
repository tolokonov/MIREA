package com.company.pr5;

class exercise_7 {
    public static void recursion (int n, int k){
        if (k > n / 2) {
            System.out.println(n);
            return;
        }

        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } else {
            recursion(n, ++k);
        }
    }
}
