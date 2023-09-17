/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.ufes.CalculadoraTaxaEntregaPromocional;
import com.ufes.Pedido;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class CalculadoraTaxaEntregaPromocionalTest {
    
    public CalculadoraTaxaEntregaPromocionalTest() {
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
    public void pedidoComPromocaoDeveRetornarPedidoComPromocional(){
        var pedido = new Pedido("Kevin", "Rua dos bobos", true);
        var calculadora = new CalculadoraTaxaEntregaPromocional(10);
        
        calculadora.calcularTaxaEntrega(pedido);
        assertEquals(10, pedido.getTaxaEntrega());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
