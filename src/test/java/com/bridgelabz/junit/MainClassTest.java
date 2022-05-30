package com.bridgelabz.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {
/*
    @Test
    public void sumOfTwoNumbers() {
        MainClass obj = new MainClass();
        int actual = obj.sum(17,1);
        assertEquals("sum test",18,18);
    }
    @Test
    public void mul() {
    }*/
    @Test
    public void userFirstNameShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.firstName("Arish");
        assertEquals("fName",true,result);
    }

    //UC2
    @Test
    public void userLastNameShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.lastName("Kamarasu");
        assertEquals("LName",true,result);
    }

    //UC3
    @Test
    public void  userEmailShouldPassTheRegexValidation(){
        MainClass obj = new MainClass();
        boolean result = obj.email("abc+100@gmail.com");
        assertEquals("Email",true,result);
    }

    //UC4
    @Test
    public void userMobileNumberShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.mobileNumber("91-9876543210");
        assertEquals("Mobile",true,result);
    }

    //UC5
    @Test
    public void userPassWordRule1ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule1("harish12");
        assertEquals("passwordRule1",true,result);
    }
    //UC6
    @Test
    public void userPassWordRule2ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule2("Harish12");
        assertEquals("passwordRule1",true,result);
    }
}