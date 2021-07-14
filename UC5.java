package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password::");
        String pass = scanner.next();
        String patternRule = "[a-z]{8}$";
        Pattern p = Pattern.compile(patternRule);
        Matcher m = p.matcher(pass);
        boolean b = m.matches();
        System.out.println(b);
    }
}
