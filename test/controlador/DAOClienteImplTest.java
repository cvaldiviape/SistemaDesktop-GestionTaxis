/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.Persona;
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
public class DAOClienteImplTest {
    
    public DAOClienteImplTest() {
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
     * Test of getBuscarCliente method, of class DAOClienteImpl.
     */
    @Test
    public void testGetBuscarCliente() throws Exception {
        System.out.println("getBuscarCliente");
        
        Cliente c = new Cliente();
        c.setId(5);
        
        String buscador = "0";
        
        DAOClienteImpl instance = new DAOClienteImpl();
        
        int id=5;
        String celular ="934556724";
        String email= "MELISA_XD@HOTMAIL.COM";
       
        Cliente result = instance.getBuscarCliente(c, buscador);
       
        assertEquals(id, result.getId());
        assertEquals(celular, result.getCelular());
        assertEquals(email, result.getEmail());        
    }    
}
