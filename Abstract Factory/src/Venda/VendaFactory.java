package Venda;

import NFE.NFE;
import boleto.Boleto;

public interface VendaFactory {
    
    public NFE criarNFE();
    public Boleto criarBoleto();

}
