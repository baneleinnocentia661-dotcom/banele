/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author banel
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeEach
    void setup() {
        methods = new Methods ();
        methods.FirstName = "Test";
        methods.surname = "user";
        
    }

    void setValidationDefaults() {
        methods.username = "kyl_1";
        methods.password = "ch&&sec@ke99!";
        methods.cellphone ="+27838968976";
        
    }
    

    @Test
    void testLoginStatus_Success() {
        setvalidDefaults();
        methods.enterusername = "kyl_1";
        methods.enterpassword = "ch&&se@ke99!";
        methods.entercellphone = "+27838968976";
    }
    
}
