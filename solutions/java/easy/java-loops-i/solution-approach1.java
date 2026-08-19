// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 05:18 p.m.
// Technique   for-loop-multiplication
// Time        O(1)
// Space       O(1)
// Insight     The implementation iterates through the fixed range of integers from one to ten to compute and print the product of the input integer and the current loop index.
// Interview   Before: "I would use a while loop to print the multiples." After: "Using a for loop is more idiomatic for a fixed range of ten iterations, resulting in O(1) time and space complexity regardless of the input integer N."
// Pitfalls    (1) Incorrectly setting the loop termination condition to i < 10 instead of i <= 10, which would omit the tenth multiple.  (2) Failing to format the output string exactly as N x i = result, which causes a presentation error.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for(int i=1; i<=10; i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
