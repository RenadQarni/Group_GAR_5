package TestPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ProgramPackage.Date_Time;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class Test_Date_Time {

    public Test_Date_Time() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
// this test should check if the date is correct or not.
    @Test
    public void checkDate() {
        //comment for the date method
        System.out.println("TEST FOR checkDate METHOD.");
        Date_Time test2 = new Date_Time();
        //as we use the assertEquals method we should have two result one 
        //for our expections and the other is for the actual result.
        boolean expResult = true;        
        boolean result = test2.checkDate(new Date(2021,12,30));
        assertEquals(expResult, result);
    }
}
