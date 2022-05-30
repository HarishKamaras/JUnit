package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    /* int sum(int a, int b){
         int s =a+b;
     return s;
     }
     int mul(int a, int b){
         int s=a*b;
         return s;
     }*/
    public boolean firstName(String firstName) {
        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
//UC2
   public boolean lastName(String lastName) {
        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }
}
