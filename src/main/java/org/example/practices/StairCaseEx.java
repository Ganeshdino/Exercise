package org.example.practices;

public class StairCaseEx {
    public static void main(String[] args) {
        staircase(5);
    }

    public static void staircase(int n) {
        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Print (n - i) spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print i # symbols
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
