package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Visao extends JFrame{
    private JTextField n1 = new JTextField(3);
    private JTextField n2 = new JTextField(3);
    private JTextField resultado = new JTextField(6);
    private JButton btn = new JButton("Somar");

    public Visao(){
        JPanel painel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 100);

        painel.add(n1);
        painel.add(n2);
        painel.add(btn);
        painel.add(resultado);
        this.add(painel);
    }

    public int getN1(){
        return Integer.parseInt(n1.getText());
    }

    public int getN2(){
        return Integer.parseInt(n2.getText());
    }

    public int getResultado(){
        return Integer.parseInt(resultado.getText());
    }

    public void setResultado(int resultado){
        this.resultado.setText(Integer.toString(resultado));
    }

    public void addListener(ActionListener listener){
        btn.addActionListener(listener);
    }

    public void  mensagemErro(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

}