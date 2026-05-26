package service;

import model.Contrato;
import model.Parcela;

import java.time.LocalDate;

public class ServicoContrato {

    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void contratoProcessado(Contrato contrato, int meses){

        contrato.getParcelas().add(new Parcela(LocalDate.of(2026,5,26), 206.04));
        contrato.getParcelas().add(new Parcela(LocalDate.of(2026,5,26), 208.08));
    }
}
