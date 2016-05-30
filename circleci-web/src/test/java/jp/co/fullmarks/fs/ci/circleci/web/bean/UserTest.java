/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.fullmarks.fs.ci.circleci.web.bean;

import java.util.Calendar;
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
public class UserTest {

    public UserTest() {
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
     * Test of getAge method, of class User.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");

        Calendar birthday = Calendar.getInstance();
        birthday.set(2002, Calendar.JUNE, 7);

        Calendar today = Calendar.getInstance();
        today.set(2016, Calendar.JUNE, 6);

        User instance = new User("Ryo", birthday.getTime());
        instance.today = today.getTime();

        assertEquals(13, instance.getAge());
    }

}
