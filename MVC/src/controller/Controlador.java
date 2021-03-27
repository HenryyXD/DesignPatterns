package controller;

import java.awt.event.ActionListener;

import model.Modelo;
import view.Visao;

public class Controlador {
    private Visao visao;
    private Modelo modelo;

    public Controlador(Visao visao, Modelo modelo) {
        this.visao = visao;
        this.modelo = modelo;
        this.visao.addListener(listener);
    }

    ActionListener listener = e -> {
        int n1, n2;
        try {
            n1 = visao.getN1();
            n2 = visao.getN2();
            modelo.soma(n1, n2);
            visao.setResultado(modelo.getValor());
        } catch (Exception ex) {
            visao.mensagemErro("Insira dois números inteiros");
        }
    };

}
