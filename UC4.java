package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mobile number::");
        String number  = scanner.next();
        System.out.println(Pattern.matches("(0|91)?[0-9]{10}", number));
    }
}
