/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "XXXX";
        Aluno instance = new Aluno();
        instance.setNome(nome);
        assertEquals("XXXX", instance.getNome());
    }

    /**
     * Test of getAtividade method, of class Aluno.
     */
    @Test
    public void testGetAtividade() {
        System.out.println("getAtividade");
        Aluno instance = new Aluno();
        List<Atividade> expResult = null;
        List<Atividade> result = instance.getAtividade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtividade method, of class Aluno.
     */
    @Test
    public void testSetAtividade() {
        System.out.println("setAtividade");
        List<Atividade> atividade = null;
        Aluno instance = new Aluno();
        instance.setAtividade(atividade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsTaxaMatriculaPaga method, of class Aluno.
     */
    @Test
    public void testIsIsTaxaMatriculaPaga() {
        System.out.println("isIsTaxaMatriculaPaga");
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.isIsTaxaMatriculaPaga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsTaxaMatriculaPaga method, of class Aluno.
     */
    @Test
    public void testSetIsTaxaMatriculaPaga() {
        System.out.println("setIsTaxaMatriculaPaga");
        boolean isTaxaMatriculaPaga = false;
        Aluno instance = new Aluno();
        instance.setIsTaxaMatriculaPaga(isTaxaMatriculaPaga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsMensalidadePaga method, of class Aluno.
     */
    @Test
    public void testIsIsMensalidadePaga() {
        System.out.println("isIsMensalidadePaga");
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.isIsMensalidadePaga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsMensalidadePaga method, of class Aluno.
     */
    @Test
    public void testSetIsMensalidadePaga() {
        System.out.println("setIsMensalidadePaga");
        boolean isMensalidadePaga = false;
        Aluno instance = new Aluno();
        instance.setIsMensalidadePaga(isMensalidadePaga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Aluno.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Aluno instance = new Aluno();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Aluno.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 123L;
        Aluno instance = new Aluno();
        instance.setId(id);
        assertEquals(123L, (long) instance.getId());
        
    }
    
    @Test
    public void testMatricula(){
        System.out.println("matricula");
        Aluno a = new Aluno();
        Atividade atv = new Atividade();
        a.matricula(atv);
        assertTrue(a.getAtividade().contains(atv));
    }
    @Test
    public void testMatriculaMensalidade(){
        System.out.println("matricula");
        Aluno a = new Aluno();
        Atividade atv = new Atividade();
        a.matricula(atv);
        assertEquals(1, a.getMensalidades().size());
        assertTrue(a.getAtividade().contains(atv));
    }
    @Test
    public void testMatriculaMensalidadePrimeiroValor(){
        System.out.println("matricula de 150%");
        Aluno a = new Aluno();
        Atividade atv = new Atividade();
        atv.setMensalidade(100.0f);
        a.matricula(atv);
        Mensalidade nm = a.getMensalidades().get(0);
        
        assertEquals(150.0d, nm.getValor(),0.0001d);
    }
    @Test
    public void testMensalidadeAberta(){
        System.out.println("matricula de 150%");
        Aluno a = new Aluno();
        Atividade atv = new Atividade();
        
        atv.setMensalidade(100.0f);
        a.matricula(atv);
        Mensalidade nm = a.getMensalidades().get(0);
        
        assertEquals(150.0d, nm.getValor(),0.0001d);
    }
}
