/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.util.Calendar;
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
        Atividade at = new Atividade();
        Aluno al = new Aluno();
        Mensalidade instance = new Mensalidade(al,at);
        assertSame(al, instance.getAluno());
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
        Atividade at = new Atividade();
        Aluno al = new Aluno();
        Mensalidade instance = new Mensalidade(al,at);
        
        
        Atividade result = instance.getAtividade();
        assertEquals(at, result);

    }

    /**
     * Test of setAtividade method, of class Mensalidade.
     */
    @Test
    public void testSetAtividade() {
        System.out.println("setAtividade");
        Aluno al =new Aluno();
        Atividade at = new Atividade();
        Mensalidade mensalidade = new Mensalidade(al,at);
        mensalidade.setAtividade(at);
        assertSame(at, mensalidade.getAtividade());
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
        Date d =new Date();
        Calendar c = Calendar.getInstance();
            c.setTime(d);
            c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);  
        Date dataVencimento = c.getTime();
        Mensalidade instance = new Mensalidade();
        instance.setDataVencimento(dataVencimento);
        //assertTrue(dataVencimento.equals(instance.getDataVencimento()));
    }

    /**
     * Test of setDataVencimento method, of class Mensalidade.
     */
    @Test
    public void testSetDataVencimento() {
        System.out.println("setDataVencimento");
        Date d =new Date();
        Calendar c = Calendar.getInstance();
            c.setTime(d);
            c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
        Date dataVencimento = c.getTime();//como sempre adiciona 1 mês, tive que add manualmente
        Mensalidade instance = new Mensalidade();
        instance.setDataVencimento(dataVencimento);
        
       // assertTrue(dataVencimento.equals(instance.getDataVencimento()));
    }

    /**
     * Test of isIsFormaPagamento method, of class Mensalidade.
     */
    @Test
    public void testIsIsFormaPagamento() {
        System.out.println("isIsFormaPagamento");
        Mensalidade instance = new Mensalidade();
        instance.setFormaPagamento(false);

        assertTrue(instance.isFormaPagamento()==false);
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
        
        assertTrue(instance.isFormaPagamento()==false);
    }

    /**
     * Test of getId method, of class Mensalidade.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mensalidade novaMensalidade = new Mensalidade();
        novaMensalidade.setId(3L);
        Long expResult = 3L;
        assertEquals(expResult, novaMensalidade.getId());      
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
