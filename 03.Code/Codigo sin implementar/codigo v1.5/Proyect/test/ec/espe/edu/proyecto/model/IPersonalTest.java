/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel castillo
 */
public class IPersonalTest {
    
    public IPersonalTest() {
    }

    
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        IPersonal.create();

    }

    /**
     * Test of existPersonal method, of class IPersonal.
     */
    @Test
    public void testExistPersonal() {
        System.out.println("existPersonal");
        String userName = "juan";
        String userContra = "pedro123";
        IPersonal instance = new IPersonal();
        boolean expResult = false;
        boolean result = instance.existPersonal(userName, userContra);
        assertEquals(expResult, result);
 
    }
    
        @Test
    public void testExistPersona() {
        System.out.println("existPersonal");
        String userName = "pepito";
        String userContra = "pedro123";
        IPersonal instance = new IPersonal();
        boolean expResult = false;
        boolean result = instance.existPersonal(userName, userContra);
        assertEquals(expResult, result);
 
    }
    public void testExistPersonall() {
        System.out.println("existPersonal");
        String userName = "pepito";
        String userContra = "pepito 123";
        IPersonal instance = new IPersonal();
        boolean expResult = false;
        boolean result = instance.existPersonal(userName, userContra);
        assertEquals(expResult, result);
 
    }
    
}
