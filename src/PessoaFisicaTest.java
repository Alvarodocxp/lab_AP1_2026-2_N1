import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaFisicaTest {
    
    @BeforeEach 
    public void setUp(){
		conta = new ContaCorrente("123456789-01", 100);
    }

    @Test 
    public void cadastraContaCorretamente(){
        conta1 = new PessoaFisica("Pamela Fernandes", "123456789-01");
        
        
    }

    @Test 
    public void verificaStatusRegular(){
        //Arrange 

        
    }

    @Test 
    public void calculaCreditoCorretamente(){
        //TODO
    }


}