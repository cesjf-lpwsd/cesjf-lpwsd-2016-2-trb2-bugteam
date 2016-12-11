/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.util.ArrayList;
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
        instance.setNome("Filipe");
        String result = instance.getNome();
        assertEquals("Filipe", result);
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
        Atividade at = new Atividade();
        at.setNome("Volei");
        List<Atividade> lat = new ArrayList<>();
        lat.add(at);
        instance.setAtividades(lat);
        assertTrue( instance.getAtividades().contains(at));
    }

    /**
     * Test of setAtividade method, of class Aluno.
     */
    @Test
    public void testSetAtividade() {
        System.out.println("setAtividade");
        List<Atividade> atividade = null;
        Aluno instance = new Aluno();
        instance.setAtividades(atividade);
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Aluno instance = new Aluno();
        instance.setId(5L);
  
        Long result = instance.getId();
        assertEquals(instance.getId(), result);
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
        assertTrue(a.getAtividades().contains(atv));
    }
    @Test
    public void testMatriculaMensalidade(){
        System.out.println("matricula");
        Aluno a = new Aluno();
        Atividade atv = new Atividade();
        a.matricula(atv);
        assertEquals(1, a.getMensalidades().size());
        assertTrue(a.getAtividades().contains(atv));
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

    /**
     * Test of getAtividades method, of class Aluno.
     */
    @Test
    public void testGetAtividades() {
        System.out.println("getAtividades");
        Aluno instance = new Aluno();
        instance.setNome("Filipe");
        Atividade at =new Atividade();
        at.setNome("Basket");
        List<Atividade> expResult =  new ArrayList<>();
        expResult.add(at);
        instance.setAtividades(expResult);
        List<Atividade> result = instance.getAtividades();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAtividades method, of class Aluno.
     */
    @Test
    public void testSetAtividades() {
        System.out.println("setAtividades");
        Atividade at = new Atividade();
        at.setId(12L);
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(at);
        Aluno instance = new Aluno();
        instance.setAtividades(atividades);
        assertTrue(instance.getAtividades().contains(at));
    }

    /**
     * Test of getMensalidades method, of class Aluno.
     */
    @Test
    public void testGetMensalidades() {
        System.out.println("getMensalidades");
        Aluno instance = new Aluno();
        Atividade at = new Atividade();
        Mensalidade m = new Mensalidade(instance, at);
        
        List<Mensalidade> lmen = new ArrayList();
        lmen.add(m);
        //List<Mensalidade> result = instance.getMensalidades();
        assertTrue(lmen.contains(m));

    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno instance = new Aluno();
        instance.setNome("Bruna");

        String result = instance.toString();
        assertEquals("Bruna", result);
    
    }

    /**
     * Test of hashCode method, of class Aluno.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Aluno instance = new Aluno();
        int expResult = 553;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Aluno.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }
}
