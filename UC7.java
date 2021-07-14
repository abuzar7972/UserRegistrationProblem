package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password::");
        String pass = scanner.next();
        String patternRule = "[A-Z]{1}+[0-9]{1}+[a-z]{6}$";
        Pattern p = Pattern.compile(patternRule);
        Matcher m = p.matcher(pass);
        boolean b = m.matches();
        System.out.println(b);
    }
}
