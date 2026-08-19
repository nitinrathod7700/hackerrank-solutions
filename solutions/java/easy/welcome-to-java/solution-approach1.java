// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
// Problem     Welcome to Java!
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 04:39 p.m.
// Technique   standard-output-printing
// Time        O(1)
// Space       O(1)
// Insight     The program executes two sequential print operations to the standard output stream to satisfy the required output format.
// Interview   Before: "How do you output text to the console in Java?" After: "You use System.out.println to print strings followed by a newline. This solution runs in O(1) time and O(1) space, as it performs a fixed number of operations regardless of input."
// Pitfalls    (1) Failing to include the exact punctuation required in the output strings.  (2) Omitting the required newline character by using print instead of println.
// ──────────────────────────────────────────────────

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        
        System.out.println("Hello, World.");

        System.out.println("Hello, Java.");

    }
}
