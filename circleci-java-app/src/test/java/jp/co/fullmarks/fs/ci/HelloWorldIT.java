/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.fullmarks.fs.ci;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sugiyama
 */
public class HelloWorldIT {

    public HelloWorldIT() {
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

    /**
     * Test of sayHelloWorld method, of class HelloWorld.
     */
    @Test
    public void testSayHelloWorld() {
        System.out.println("sayHelloWorld");
        HelloWorld instance = new HelloWorld();
        String expResult = "Hello World!!";
        String result = instance.sayHelloWorld();
        assertEquals(expResult, result);
    }

}
