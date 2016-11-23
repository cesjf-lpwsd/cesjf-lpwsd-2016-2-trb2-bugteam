/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.util.Date;
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
public class MensalidadeTest {
    
    public MensalidadeTest() {
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
     * Test of getAluno method, of class Mensalidade.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        Mensalidade instance = new Mensalidade();
        assertEquals(null, instance.getAluno());
    }

    /**
     * Test of setAluno method, of class Mensalidade.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Aluno aluno = new Aluno();
        aluno.setNome("Bruna");
        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setAluno(aluno);
        assertSame(aluno, mensalidade.getAluno());
    }

    /**
     * Test of getAtividade method, of class Mensalidade.
     */
    @Test
    public void testGetAtividade() {
        System.out.println("getAtividade");
        Mensalidade instance = new Mensalidade();
        Atividade expResult = null;
        Atividade result = instance.getAtividade();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAtividade method, of class Mensalidade.
     */
    @Test
    public void testSetAtividade() {
        System.out.println("setAtividade");
        Atividade atividade = null;
         Mensalidade mensalidade = new Mensalidade();
        mensalidade.setAtividade(atividade);
       // instance.setAtividade(atividade);
        assertSame(atividade, mensalidade.getAtividade());
    }

    /**
     * Test of getManutencao method, of class Mensalidade.
     */
    @Test
    public void testGetManutencao() {
        System.out.println("getManutencao");
        Mensalidade mensalidade = new Mensalidade();
        float expResult = 0.0F;
        mensalidade.setManutencao(expResult);
        float result = mensalidade.getManutencao();
        assertEquals(expResult, result, 0.000001f);
    }

    /**
     * Test of setManutencao method, of class Mensalidade.
     */
    @Test
    public void testSetManutencao() {
        System.out.println("setManutencao");
        float manutencao = 0.0F;
        Mensalidade instance = new Mensalidade();
        instance.setManutencao(manutencao);
        assertEquals(manutencao, instance.getManutencao(), 0.0001f);

    }

    /**
     * Test of getDataVencimento method, of class Mensalidade.
     */
    @Test
    public void testGetDataVencimento() {
        System.out.println("getDataVencimento");
        Mensalidade instance = new Mensalidade();
        Date expResult = null;
        instance.setDataVencimento(expResult);
        Date result = instance.getDataVencimento();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setDataVencimento method, of class Mensalidade.
     */
    @Test
    public void testSetDataVencimento() {
        System.out.println("setDataVencimento");
        Date dataVencimento = null;
        Mensalidade instance = new Mensalidade();
        instance.setDataVencimento(dataVencimento);
        assertEquals(dataVencimento, instance.getDataVencimento());
    }

    /**
     * Test of isIsFormaPagamento method, of class Mensalidade.
     */
    @Test
    public void testIsIsFormaPagamento() {
        System.out.println("isIsFormaPagamento");
        Mensalidade instance = new Mensalidade();
        boolean expResult = false;
        boolean result = instance.isFormaPagamento();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIsFormaPagamento method, of class Mensalidade.
     */
    @Test
    public void testSetIsFormaPagamento() {
        System.out.println("setIsFormaPagamento");
        boolean isFormaPagamento = false;
        Mensalidade instance = new Mensalidade();
        instance.setFormaPagamento(isFormaPagamento);
    }

    /**
     * Test of getId method, of class Mensalidade.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mensalidade novaMensalidade = new Mensalidade();
        Long expResult = null;
        Long result = novaMensalidade.getId();
        assertEquals(expResult, result);      
    }

    /**
     * Test of setId method, of class Mensalidade.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1L;
        Mensalidade instance = new Mensalidade();
        instance.setId(id);
        Long resultado = instance.getId();
        assertEquals(id, resultado);
    }
    
}
