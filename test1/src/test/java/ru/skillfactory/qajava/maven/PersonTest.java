package ru.skillfactory.qajava.maven;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertTrue;


public class PersonTest {

    public static void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
        currentTime();
    }


    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
        currentTime();
    }


    @Test
    public static void isTeenager() {
        boolean result = Person.isTeenager(16);
        System.out.println(result);
        assertTrue(result);
    }
}
