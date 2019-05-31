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
public class FuncionesTest {
    
    public FuncionesTest() {
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
     * Test of generarNumero method, of class Funciones.
     */
    @Test
    public void testGenerarNumero() {
        System.out.println("generarNumero");
        int length = 4;
        String expResult = "4";
        String result = Funciones.generarNumero(length); //en este caso revisamos que devuelva un numero de 4 digitos.
        assertEquals(expResult, Integer.toString(result.length()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarNumeroOrdenador method, of class Funciones.
     */
    @Test
    public void testValidarNumeroOrdenador() {
        System.out.println("validarNumeroOrdenador");
        String numero = Funciones.generarNumero(4); //le asignamos la funcion generarNumero(int) y revisamos que genere numeros sin repetir
        boolean expResult = true;
        boolean result = Funciones.validarNumeroOrdenador(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
