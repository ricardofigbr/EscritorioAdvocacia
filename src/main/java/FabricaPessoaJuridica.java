public class FabricaPessoaJuridica implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaJuridica();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPessoaJuridica();
    }
}
