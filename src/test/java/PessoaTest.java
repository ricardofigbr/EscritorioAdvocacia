import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Procuração Pessoa Fisica", pessoa.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Procuração Pessoa Juridica", pessoa.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato Pessoa Física", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato Pessoa Júridica", pessoa.emitirContrato());
    }

}