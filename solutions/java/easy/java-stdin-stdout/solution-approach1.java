// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 04:58 p.m.
// Technique   scanner-buffer-clearing
// Time        O(1)
// Space       O(1)
// Insight     The scanner requires an explicit nextLine call to consume the trailing newline character left in the buffer after reading numeric tokens before reading the subsequent string.
// Interview   Before: "How do I read a string after an integer?" After: "You must call nextLine() to consume the newline character left by nextInt(), otherwise the string read will be empty. This approach runs in O(1) time and space."
// Pitfalls    (1) Failing to consume the newline character after nextInt() or nextDouble() causes the subsequent nextLine() to return an empty string.  (2) Assuming nextLine() behaves like next() when reading input tokens.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        // System.out.println("String:" + "Welcome to HackerRank's Java tutorials!" );
        // System.out.println("Double:"+d);
        // System.out.println("Int:"+i);
    }
}
