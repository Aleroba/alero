/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import validacion.PasswordValidator;
public class TestJUnit {
    
   @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("Passw0rd!"));
    }

    @Test
    public void testInvalidPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Pwd1!"));
    }

    @Test
    public void testInvalidPasswordContainsSpace() {
        assertFalse(PasswordValidator.isValidPassword("Pass word1!"));
    }

    @Test
    public void testInvalidPasswordNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("password1!"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("Password!"));
    }

    @Test
    public void testInvalidPasswordNoSpecialChar() {
        assertFalse(PasswordValidator.isValidPassword("Password123"));
    }

    @Test
    public void testInvalidPasswordNull() {
        assertFalse(PasswordValidator.isValidPassword(null));
    }
}
