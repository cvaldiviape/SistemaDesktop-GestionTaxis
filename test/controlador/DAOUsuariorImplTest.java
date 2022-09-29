/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sathiel
 */
public class DAOUsuariorImplTest {
    
    public DAOUsuariorImplTest() {
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
     * Test of getValidarLogin method, of class DAOUsuariorImpl.
     */
    @Test
    public void testGetValidarLogin() throws Exception {
        System.out.println("getValidarLogin");
        
        Usuario admi = new Usuario();
        admi.setUsername("Melek");
        admi.setPass("123");
        
        DAOUsuariorImpl instance = new DAOUsuariorImpl();
        
        int id= 1;
        
        Usuario result = instance.getValidarLogin(admi);
        
        assertEquals(id, result.getId());  
    } 
}
