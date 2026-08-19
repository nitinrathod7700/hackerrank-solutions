// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 04:48 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } 
        else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } 
        else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } 
        else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
