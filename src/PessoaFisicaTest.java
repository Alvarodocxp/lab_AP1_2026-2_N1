import static org.junit.Assert.assertEquals;

import java.io.ObjectInputFilter.Status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaFisicaTest {
    @BeforeEach // pqp
    public void setUp(){
        pessoa1 = new PessoaFisica("Alvaro", 77777777-50);
        conta1 = new ContaCorrente ("777777777-50", 300);
        conta2 = new ContaCorrente("777777777-50", 0);
        conta1.depositar(500);
        conta2.depositar(200);
    }

    @Test 
    public void cadastraContaCorretamente(){
        //TODO
        adicionarConta.ContaCorrente(conta1);
        adicionarConta.ContaCorrente(conta2);
        assertEquals("Alvaro", 77777777750);
    }

    @Test 
    public void verificaStatusRegular(){
        //TODO 50%
        pessoa1.status();
        
        assertEquals("Regular", String);
    }

    @Test 
    public void calculaCreditoCorretamente(){
        //TODO
        pessoa1.credito(conta1, conta2)
        assertEquals(300, 0.1);
    }


}
