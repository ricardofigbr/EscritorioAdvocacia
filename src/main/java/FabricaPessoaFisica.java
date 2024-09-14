public class FabricaPessoaFisica implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaFisica();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPessoaFisica();
    }
}
