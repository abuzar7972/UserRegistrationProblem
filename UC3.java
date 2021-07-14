package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email address::");
        String email = scanner.next();
        String rules = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean result = email.matches(rules);
        System.out.println(result);
    }
}
