// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 05:25 p.m.
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
