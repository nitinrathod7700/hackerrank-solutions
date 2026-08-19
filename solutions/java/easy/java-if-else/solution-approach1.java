// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 04:48 p.m.
// Technique   conditional-branching-logic
// Time        O(1)
// Space       O(1)
// Insight     The implementation maps the integer parity and range constraints directly to a sequence of if-else conditional branches to determine the output string.
// Interview   Before: "I would use a series of nested if-else statements to check the parity and range of the integer." After: "The solution uses O(1) time and space by evaluating the four distinct conditions defined in the problem, ensuring correct classification for all positive integers n."
// Pitfalls    (1) Failing to account for the inclusive range boundaries 2, 5, 6, and 20 as specified in the problem.  (2) Incorrectly ordering the conditional checks, which could lead to overlapping logic for even numbers.  (3) Assuming the input is always within a specific range, ignoring the requirement to handle any positive integer n.
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
