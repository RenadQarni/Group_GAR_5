
package TestPackage;

import ProgramPackage.BuyProducts;
import ProgramPackage.Cart;
import ProgramPackage.Order;
import ProgramPackage.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bushra
 */
public class Test_Cart {
    
    public Test_Cart() {
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
    @Test 
      public void increment_amount_Test() {
        System.out.println("Test for increment amount  method.");
        Cart test2 = new Cart();
        Product p1 = new Product("Auto food Dispenser", 100, false, 1);
        int expResult= 2 ; 
        int result = test2.increment_amount(p1);
        assertEquals(expResult, result);
    }
      
      @Test 
      
      public void decrement_amount_Test() {
        System.out.println("Test for decrement amount method.");
        Cart test3 = new Cart();
        Product product_2 = new Product("Auto food Dispenser", 100, false, 2);
        int expResult= 1 ; 
        int result = test3.decrement_amount(product_2);
        assertEquals(expResult, result);
    }
      
      
    

}
