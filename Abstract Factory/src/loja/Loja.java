package loja;

import NFE.NFE;
import NFE.NFEMinasGerais;
import Venda.VendaFactory;
import boleto.Boleto;
import boleto.BoletoBradesco;

public class Loja implements VendaFactory{

    @Override
    public NFE criarNFE() {
        NFE notaFiscal = new NFEMinasGerais();
        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {
        Boleto boleto = new BoletoBradesco();
        return boleto;
    }
    
}
