/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinacuatro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanfrarow
 */
public class adivinaOrdenadorTest {
    
    public adivinaOrdenadorTest() {
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
     * Test of adivinador method, of class adivinaOrdenador.
     */
    @Test
    public void testAdivinador() {
        System.out.println("Metodo Principal");
        String actual = "6103";
        String[] numero = {"4710","5021"};
        int[] bien = {0,0};
        int[] regular = {2,2};
        boolean expResult = true;
        boolean result = adivinaOrdenador.comparaAnteriores(0, bien, regular, numero, actual);
        assertEquals(expResult, result);
}

    /**
     * Test of comparaAnteriores method, of class adivinaOrdenador.
     */
    @Test
    public void testComparaAnteriores() {
        System.out.println("Funcion de comparacion");
        int contador = 0;
        int[] acierto = {1,0};
        int[] regular = {1,0};
        String[] numeros = {"8730","5679"};
        String numero = "8045";
        boolean expResult = true;
        boolean result = adivinaOrdenador.comparaAnteriores(contador, acierto, regular, numeros, numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
