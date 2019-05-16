package com.example.adamc.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;


public class ValidatorTests {
    @Test
    public void rejectPasswordCalledPassword() {
        assertEquals(Validator.isValidPassword("password"), false);
        assertEquals(Validator.isValidPassword("Password"), false);
        assertEquals(Validator.isValidPassword("PASSWORD"), false);
        assertEquals(Validator.isValidPassword("PASSWoRD"), false);
        assertEquals(Validator.isValidPassword("PaSsWoRd"), false);
    }

    @Test
    public void rejectPasswordShorterThan8Char() {
        assertEquals(Validator.isValidPassword("01234567"), false);
    }
}