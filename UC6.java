package com.bl.userproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password::");
        String pass = scanner.next();
        String patternRule = "[A-Z]{1}+[a-z]{7}$";
        Pattern p = Pattern.compile(patternRule);
        Matcher m = p.matcher(pass);
        boolean b = m.matches();
        System.out.println(b);
    }
}
