package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name 'First latter should be Capital'::");
        String name = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}" ,name));
    }
}
