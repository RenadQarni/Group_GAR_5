package TestPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ProgramPackage.BuyProducts;
import ProgramPackage.Product;
import java.util.ArrayList;
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
public class Test_BuyProducts {

    ArrayList<Product> addedProducts = new ArrayList<>();

    public Test_BuyProducts() {
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
    
// this test should test the addProduct() method if the date is not null.  
    @Test
    public void addProductTest() {
        System.out.println("TEST FOR addProduct METHOD.");
        BuyProducts test1 = new BuyProducts();
        Product p1 = new Product("Auto food Dispenser", 100, false, 0);
        test1.addProduct(p1); 
        assertNotNull(test1);
    }
    
    
    
}
