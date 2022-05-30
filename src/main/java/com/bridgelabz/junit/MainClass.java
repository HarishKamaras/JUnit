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
    //UC3
    public boolean email(String email) {
        String emailPattern = "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        Pattern pattern2 = Pattern.compile(emailPattern);
        Matcher matcher2 = pattern2.matcher(email);
        boolean result = matcher2.matches();
        return result;
    }
    //UC4
    public boolean mobileNumber(String mobileNumber) {
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(mobileNumber);
        Boolean result = matcher3.matches();
        return result;
    }
    public boolean passwordRule1(String passWord) {
        String PasswordPattern = "[a-zA-Z0-9~!@#$]{8,}";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    public boolean passwordRule2(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    public boolean passwordRule3(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }

    public boolean passwordRule4(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[a-zA-Z0-9@#$%^&+=]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }

}
