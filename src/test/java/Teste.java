/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leticia
 */
public class Teste {
    
    private Paciente paciente;
    
    private final String nome = "Pedro Moura";
    private final String endereco = "Rua Castelo Branco";
    private final String telefone = "3333-1120";
    private final String datanascimento = "02/04/1992";
    private final String profissao = "Engenheiro";
    private final String cpf = "098.789.111-76";
    
    public Teste() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
