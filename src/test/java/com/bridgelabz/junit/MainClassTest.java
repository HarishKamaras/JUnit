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

   /* @Test
    public void userLastNameShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.lastName("Kamarasu");
        assertEquals("LName",true,result);
    }*/
}