// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 05:25 p.m.
// Technique   iterative-geometric-series-summation
// Time        O(q * n)
// Space       O(1)
// Insight     The implementation maintains a running sum by iteratively adding the next term of the geometric series, where each term is calculated by doubling the previous power of two multiplied by the constant b.
// Interview   Before: "How would you compute the series terms efficiently without recalculating powers from scratch?" After: "By maintaining a running sum and a power variable that doubles each iteration, we achieve O(q * n) time complexity, which is optimal for generating n terms across q queries."
// Pitfalls    (1) Failing to reset the sum and power variables for each query leads to incorrect series values.  (2) Using an integer type for the sum may cause overflow if the series terms exceed the 32-bit signed integer limit.
// ──────────────────────────────────────────────────

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int power = 1;

            for (int j = 0; j < n; j++) {
                sum = sum + power * b;
                System.out.print(sum + " ");

                power = power * 2;
            }

            System.out.println();
        }

        in.close();
    }
}
