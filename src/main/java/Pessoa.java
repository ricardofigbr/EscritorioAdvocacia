public class Pessoa {

    private Contrato contrato;
    private Procuracao procuracao;

    public Pessoa(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.procuracao = fabrica.createProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}
