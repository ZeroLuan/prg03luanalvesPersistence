/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.curso.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a1591
 */
public class CursoTest {
    
    public CursoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Curso.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Curso instance = new Curso();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoCurso method, of class Curso.
     */
    @Test
    public void testGetCodigoCurso() {
        System.out.println("getCodigoCurso");
        Curso instance = new Curso();
        String expResult = "";
        String result = instance.getCodigoCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAtivo method, of class Curso.
     */
    @Test
    public void testIsAtivo() {
        System.out.println("isAtivo");
        Curso instance = new Curso();
        boolean expResult = false;
        boolean result = instance.isAtivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Curso.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Curso instance = new Curso();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCurso method, of class Curso.
     */
    @Test
    public void testSetCodigoCurso() {
        System.out.println("setCodigoCurso");
        String codigoCurso = "";
        Curso instance = new Curso();
        instance.setCodigoCurso(codigoCurso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtivo method, of class Curso.
     */
    @Test
    public void testSetAtivo() {
        System.out.println("setAtivo");
        boolean ativo = false;
        Curso instance = new Curso();
        instance.setAtivo(ativo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Curso.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Curso instance = new Curso();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Curso.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Curso instance = new Curso();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Curso.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Curso instance = new Curso();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = new Curso();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
