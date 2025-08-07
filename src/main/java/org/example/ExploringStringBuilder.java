package org.example;

public class ExploringStringBuilder {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n--- EXERCISE 1 ---");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        sb.append(" Welcome to");
        sb.append(" 2025");
        sb.append(".");
        System.out.println(sb);

        // Exercise 2
        System.out.println("\n--- EXERCISE 2 ---");
        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        System.out.println(sb2);

        // Exercise 3
        System.out.println("\n--- EXERCISE 3 ---");
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");

        sb3.delete(8, 15);
        System.out.println("After delete(8, 15): " + sb3);

        sb3.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb3);

        // Exercise 4
        System.out.println("\n--- EXERCISE 4 ---");
        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        sb4.replace(22, 28, "Java");
        System.out.println(sb4);

        // Exercise 5
        System.out.println("\n--- EXERCISE 5 ---");
        StringBuilder sb5 = new StringBuilder("Start");
        sb5.append("...").insert(0, "Ready, Set, ").delete(14, 17);
        System.out.println(sb5);

        // Exercise 6
        System.out.println("\n--- EXERCISE 6 ---");
        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog.");

        String sub = sb6.substring(16, 19);
        System.out.println("Substring: " + sub);

        int indexOfFox = sb6.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        int indexOfCat = sb6.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);

        // Exercise 7
        System.out.println("\n--- EXERCISE 7 ---");
        StringBuilder sb7 = new StringBuilder("Status: ");
        sb7.append("Pending");

        String finalStatus = sb7.toString();

        sb7.append(" - Approved");

        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);
    }
}
