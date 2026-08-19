// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 04:42 p.m.
// Technique   scanner-input-stream-processing
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes the Scanner class to sequentially extract three integer tokens from the standard input stream and prints each to a new line.
// Interview   Before: "How do I read multiple integers from stdin in Java?" After: "You can use the Scanner class to read tokens sequentially. This approach runs in O(1) time and O(1) space, effectively handling the three required integers as specified in the problem statement."
// Pitfalls    (1) Failing to handle potential InputMismatchException if the input stream contains non-integer tokens.  (2) Neglecting to close the Scanner object, which may lead to resource leaks in larger applications.  (3) Assuming the input stream contains exactly three integers when the problem might provide more or fewer.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // Complete this line
        // Complete this line
    }
}
